package com.github.retrofitutil;

import android.content.Context;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator on 2017/1/9.
 */
public class NetWorkManager {
    private static Retrofit commonClient;
    private static Retrofit stringClient;
    private static Retrofit withCacheClient;
    private static String baseUrl;
    private static Context context;
    private static File httpCacheDirectory;//= new File(context.getCacheDir(), "MyRetrofitCache");
    private static int cacheSize;//= 10 * 1024 * 1024; // 10 MiB
    private static Cache cache;//= new Cache(httpCacheDirectory, cacheSize);
    private static String noNetworkExceptionMsg;
    private static boolean isDebug;
    /**
     * 必须在application中初始化和设置baseurl，拿到Context(设置缓存需要使用)
     * @param ctx
     */
    public static void init(Context ctx, String url) {
        init(ctx,url,60,"无网络连接,请检查之后再试",true);
    }
    /**
     *
     * @param ctx 上下文
     * @param url ip+端口
     * @param cachTime  缓存有效时间
     * @param noNetworkMsg  无网络连接提示语
     * @param debugFlag   是否是debug模式 true-debug,false-release
     */
    public static void init(Context ctx, String url,final int cachTime,String noNetworkMsg,boolean debugFlag) {
        Logger.init("MyLog")
                .methodCount(1)
                .logLevel(debugFlag? LogLevel.FULL : LogLevel.NONE)
                .methodCount(3);
        context = ctx;
        baseUrl = url;
        isDebug=debugFlag;
        noNetworkExceptionMsg=noNetworkMsg;
        httpCacheDirectory = new File(context.getCacheDir(), "MyRetrofitCache");
        cacheSize = 10 * 1024 * 1024; // 10 MiB
        cache = new Cache(httpCacheDirectory, cacheSize);
        rewrite_cache_control_interceptor= new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response originalResponse = chain.proceed(chain.request());
                MyLog.i("MyLog-cache", "get cache");
                int maxAge = cachTime; // 在线缓存在1分钟内可读取
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader(CACHE_CONTROL)
                        .header(CACHE_CONTROL, "public, max-age=" + maxAge)
                        .build();
            }
        };
    }

    private NetWorkManager() {
    }

    /**
     * 常规的客户端(返回对象,默认不带缓存)
     *
     * @return
     */
    public static Retrofit getCommonClient() {
        if (commonClient == null) {
            synchronized (NetWorkManager.class) {
                if (commonClient == null) {
                    commonClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClient(false))
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return commonClient;
    }

    /**
     * 返回String的客户端(不带缓存)
     *
     * @return
     */
    public static Retrofit getStringClient() {
        if (stringClient == null) {
            synchronized (NetWorkManager.class) {
                if (stringClient == null) {
                    stringClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClient(false))
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
                }
            }
        }
        return stringClient;
    }

    /**
     * 带缓存的客户端(返回对象)
     *
     * @return
     */
    public static Retrofit getWithCacheClient() {
        if (withCacheClient == null) {
            synchronized (NetWorkManager.class) {
                if (withCacheClient == null) {
                    withCacheClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClient(true))
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return withCacheClient;
    }

    private static OkHttpClient getHttpClient(final boolean hasCache) {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                if(!hasCache){//没有使用缓存时才判断有无网络连接
                    NetworkMonitor networkMonitor=new NetworkMonitor(context);
                    if (!networkMonitor.isConnected()) {
                        throw new NoNetworkException(noNetworkExceptionMsg);
                    }
                }
                if (isDebug) {
                    long t1 = System.nanoTime();
                    Response response = chain.proceed(request);
                    long t2 = System.nanoTime();
                    double time = (t2 - t1) / 1e6d;
                    String bodyStr = response.body().string();
                    String msg = "\nurl-->" + request.url()
                            + "\ntime-->" + time
                            + "ms\nheaders-->" + request.headers()
                            + "\nresponse code-->" + response.code()
                            + "\nresponse headers-->" + response.headers()
                            + "\nbody-->" +bodyStr;

                    if (request.method().equals("GET")) {
                        Logger.i("GET"+msg);//
                    } else if (request.method().equals("POST")) {
                        Request copyRequest = request.newBuilder().build();
                        if (copyRequest.body() instanceof FormBody) {
                            Buffer buffer = new Buffer();
                            copyRequest.body().writeTo(buffer);
                            Logger.i("request params:" + buffer.readUtf8());
                        }
                        Logger.i("POST"+msg);
                    } else if (request.method().equals("PUT")) {
                        Logger.i("PUT"+msg);
                    } else if (request.method().equals("DELETE")) {
                        Logger.i("DELETE"+msg);
                    }
                }
                return chain.proceed(request);
            }
        };

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(NetConstant.HTTP_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(NetConstant.HTTP_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(NetConstant.HTTP_WRITE_TIMEOUT, TimeUnit.SECONDS);
        if (hasCache) {
            okHttpClient.addNetworkInterceptor(rewrite_cache_control_interceptor);
            okHttpClient.cache(cache);
        }
        okHttpClient.addInterceptor(interceptor);
        return okHttpClient.build();
    }

    /*private static File httpCacheDirectory ;//= new File(context.getCacheDir(), "MyRetrofitCache");
    private static int cacheSize = 10 * 1024 * 1024; // 10 MiB
    private static Cache cache = new Cache(httpCacheDirectory, cacheSize);*/
    private static final String CACHE_CONTROL = "Cache-Control";
    private static  Interceptor rewrite_cache_control_interceptor;
}
