package com.github.retrofitutil;

import android.content.Context;

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
    private static int HTTP_CONNECT_TIMEOUT = 15;
    private static int HTTP_WRITE_TIMEOUT = 20;
    private static int HTTP_READ_TIMEOUT = 20;
    /***
     * 结合Rxjava使用,返回对象,无缓存
     */
    private static Retrofit commonClient;
    /***
     * 结合Rxjava使用,返回对象,有缓存
     */
    private static Retrofit commonWithCacheClient;
    /***
     * 结合Rxjava使用,返回String,无缓存
     */
    private static Retrofit stringClient;
    /***
     * 结合Rxjava使用,返回String,有缓存
     */
    private static Retrofit stringWithCacheClient;
    /***
     * 普通client不与Rxjava结合,返回对象,无缓存
     */
    private static Retrofit generalClient;
    /***
     * 普通client不与Rxjava结合,返回对象,有缓存
     */
    private static Retrofit generalWithCachClient;
    /***
     * 普通client不与Rxjava结合,返回String,无缓存
     */
    private static Retrofit generalStringClient;
    /***
     * 普通client不与Rxjava结合,返回String,有缓存
     */
    private static Retrofit generalStringWithCachClient;
    private static String baseUrl;
    private static Context context;
    private static File httpCacheDirectory;//= new File(context.getCacheDir(), "MyRetrofitCache");
    private static Cache cache;//= new Cache(httpCacheDirectory, cacheSize);
    private static String noNetworkExceptionMsg;
    private static boolean isDebug=true;

    /*缓存时间默认60秒*/
    private int cachTime=60;
    /*缓存数据大小,默认20MB 20*1024*1024*/
    private int cacheSize=20 * 1024 * 1024;
    /*无网络提示语*/
    private String noNetworkMsg="无网络连接,请稍后再试";

    /***
     * @param cachTime 设置缓存时间，默认60秒
     * @return
     */
    public NetWorkManager setCachTime(int cachTime){
        this.cachTime=cachTime;
        return this;
    }
    /***
     * @param noNetworkMsg 设置无网络提示语
     * @return
     */
    public NetWorkManager setNoNetWorkMsg(String noNetworkMsg){
        this.noNetworkMsg=noNetworkMsg;
        return this;
    }
    /***
     * @param debugFlag 默认true为debug模式,release需要设置为false
     * @return
     */
    public NetWorkManager setDebugFlag(boolean debugFlag){
        this.isDebug=debugFlag;
        return this;
    }
    /***
     * @param cacheSize 设置缓存数据大小，默认20MB  20*1024*1024
     * @return
     */
    public NetWorkManager setCacheSize(int cacheSize){
        this.cacheSize=cacheSize;
        return this;
    }
    /***
     * @param httpConnectTimeout 设置请求超时时间,默认15秒
     * @return
     */
    public NetWorkManager setHttpConnectTimeout(int httpConnectTimeout) {
        HTTP_CONNECT_TIMEOUT = httpConnectTimeout;
        return this;
    }
    /***
     * @param httpReadTimeout 设置写入时间,默认20秒
     * @return
     */
    public NetWorkManager setHttpReadTimeout(int httpReadTimeout) {
        HTTP_READ_TIMEOUT = httpReadTimeout;
        return this;
    }
    /***
     * @param httpWriteTimeout 设置读取时间,默认20秒
     * @return
     */
    public NetWorkManager setHttpWriteTimeout(int httpWriteTimeout) {
        HTTP_WRITE_TIMEOUT = httpWriteTimeout;
        return this;
    }
    /**
     *
     * @param ctx 上下文
     * @param url baseUrl:ip+端口
     * @param isDebug 是否是debug模式 true-debug,false-release
     * @return
     */
    public static NetWorkManager getInstance(Context ctx, String url,boolean isDebug){
        return new NetWorkManager(ctx,url,isDebug);
    }
    private NetWorkManager(Context ctx, String url,boolean isDebug) {
        /*Logger.init("MyLog")
                .logLevel(isDebug ? LogLevel.FULL : LogLevel.NONE)
                .methodCount(3);*/
        this.isDebug=isDebug;
        context = ctx;
        baseUrl = url;
    }
    public void complete(){
        noNetworkExceptionMsg = noNetworkMsg;
        httpCacheDirectory = new File(context.getCacheDir(), "MyRetrofitCache");
        cache = new Cache(httpCacheDirectory, cacheSize);
        rewrite_cache_control_interceptor = new Interceptor() {
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
     * 带缓存的客户端(返回对象)
     *
     * @return
     */
    public static Retrofit getCommonWithCacheClient() {
        if (commonWithCacheClient == null) {
            synchronized (NetWorkManager.class) {
                if (commonWithCacheClient == null) {
                    commonWithCacheClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClient(true))
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return commonWithCacheClient;
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
     * 返回String的客户端(带缓存)
     *
     * @return
     */
    public static Retrofit getStringWithCacheClient() {
        if (stringWithCacheClient == null) {
            synchronized (NetWorkManager.class) {
                if (stringWithCacheClient == null) {
                    stringWithCacheClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClient(true))
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
                }
            }
        }
        return stringWithCacheClient;
    }

    /**
     * 普通client不与Rxjava结合,返回对象,无缓存
     *
     * @return
     */
    public static Retrofit getGeneralClient() {
        if (generalClient == null) {
            synchronized (NetWorkManager.class) {
                if (generalClient == null) {
                    generalClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClientNoRxJava(false))
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

                }
            }
        }
        return generalClient;
    }

    /**
     * 普通client不与Rxjava结合,返回对象,有缓存
     *
     * @return
     */
    public static Retrofit getGeneralWithCachClient() {
        if (generalWithCachClient == null) {
            synchronized (NetWorkManager.class) {
                if (generalWithCachClient == null) {
                    generalWithCachClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClientNoRxJava(true))
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return generalWithCachClient;
    }

    /**
     * 普通client不与Rxjava结合,返回String,无缓存
     *
     * @return
     */
    public static Retrofit getGeneralStringClient() {
        if (generalStringClient == null) {
            synchronized (NetWorkManager.class) {
                if (generalStringClient == null) {
                    generalStringClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClientNoRxJava(false))
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
                }
            }
        }
        return generalStringClient;
    }

    /**
     * 普通client不与Rxjava结合,返回String,有缓存
     *
     * @return
     */
    public static Retrofit getGeneralStringWithCachClient() {
        if (generalStringWithCachClient == null) {
            synchronized (NetWorkManager.class) {
                if (generalStringWithCachClient == null) {
                    generalStringWithCachClient = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getHttpClientNoRxJava(true))
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
                }
            }
        }
        return generalStringWithCachClient;
    }


    /*private static File httpCacheDirectory ;//= new File(context.getCacheDir(), "MyRetrofitCache");
        private static int cacheSize = 10 * 1024 * 1024; // 10 MiB
        private static Cache cache = new Cache(httpCacheDirectory, cacheSize);*/
    private static final String CACHE_CONTROL = "Cache-Control";
    private static Interceptor rewrite_cache_control_interceptor;

    private static OkHttpClient getHttpClient(final boolean hasCache) {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                if (!hasCache) {//没有使用缓存时才判断有无网络连接
                    if (!NetworkMonitor.isConnected(context)) {
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
                            + "\nbody-->" + bodyStr;

                    if (request.method().equals("GET")) {
                        Logger.i("GET" + msg);//
                    } else if (request.method().equals("POST")) {
                        Request copyRequest = request.newBuilder().build();
                        if (copyRequest.body() instanceof FormBody) {
                            Buffer buffer = new Buffer();
                            copyRequest.body().writeTo(buffer);
                            Logger.i("request params:" + buffer.readUtf8());
                        }
                        Logger.i("POST" + msg);
                    } else if (request.method().equals("PUT")) {
                        Logger.i("PUT" + msg);
                    } else if (request.method().equals("DELETE")) {
                        Logger.i("DELETE" + msg);
                    }
                }
                return chain.proceed(request);
            }
        };

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(HTTP_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(HTTP_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(HTTP_WRITE_TIMEOUT, TimeUnit.SECONDS);
        if (hasCache) {
            okHttpClient.addNetworkInterceptor(rewrite_cache_control_interceptor);
            okHttpClient.cache(cache);
        }
        okHttpClient.addInterceptor(interceptor);
        return okHttpClient.build();
    }

    /**
     * 此处的拦截器主要因为检查网络抛异常无法像Rxjava那样自动进入error方法中,如果抛异常的话,又不方便之后的操作,所以去掉检查网络的代码
     * @param hasCache
     * @return
     */
    private static OkHttpClient getHttpClientNoRxJava(final boolean hasCache) {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
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
                            + "\nbody-->" + bodyStr;

                    if (request.method().equals("GET")) {
                        Logger.i("GET" + msg);//
                    } else if (request.method().equals("POST")) {
                        Request copyRequest = request.newBuilder().build();
                        if (copyRequest.body() instanceof FormBody) {
                            Buffer buffer = new Buffer();
                            copyRequest.body().writeTo(buffer);
                            Logger.i("request params:" + buffer.readUtf8());
                        }
                        Logger.i("POST" + msg);
                    } else if (request.method().equals("PUT")) {
                        Logger.i("PUT" + msg);
                    } else if (request.method().equals("DELETE")) {
                        Logger.i("DELETE" + msg);
                    }
                }
                return chain.proceed(request);
            }
        };

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(HTTP_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(HTTP_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(HTTP_WRITE_TIMEOUT, TimeUnit.SECONDS);
        if (hasCache) {
            okHttpClient.addNetworkInterceptor(rewrite_cache_control_interceptor);
            okHttpClient.cache(cache);
        }
        okHttpClient.addInterceptor(interceptor);
        return okHttpClient.build();
    }
}
