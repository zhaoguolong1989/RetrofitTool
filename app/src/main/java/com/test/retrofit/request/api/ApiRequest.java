package com.test.retrofit.request.api;

import com.github.retrofitutil.NetWorkManager;
import com.test.retrofit.request.entity.TestBean;
import com.test.retrofit.response.LoginBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/9.
 */
public class ApiRequest {
    protected static Retrofit getClient() {
        return getClient(true);
    }

    protected static Retrofit getStringClient() {
        return NetWorkManager.getStringClient();
    }

    protected static Retrofit getClient(boolean withCach) {
        return withCach ? NetWorkManager.getCommonWithCacheClient() : NetWorkManager.getCommonClient();
    }

    public static Observable<TestBean> getData(boolean withCach, Map<String, String> map) {
        return getClient(withCach)
                .create(IRequest.class)
                .getTestData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public static Observable<String> getDataForString(boolean withCach) {
        return getStringClient()
                .create(IRequest.class)
                .getTestDataForString()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public static Observable<String> login(Map<String, String> map) {
        return getStringClient()
                .create(IRequest.class)
                .login(map)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public static Observable<String> addInfo(Map<String, String> map) {
        return getStringClient()
                .create(IRequest.class)
                .addInfo(map)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public static void generalLoginObj(Map<String, String> map, final Callback<LoginBean> callBack) {
        Call<LoginBean> a = NetWorkManager.getGeneralClient()
                .create(IRequest.class).generalLoginObj(map);
        a.enqueue(callBack);
    }

    public static void generalLog(Map<String, String> map, final Callback<String> callBack) {
        Call<String> a = NetWorkManager.getGeneralStringClient()
                .create(IRequest.class).generalLogin(map);
        a.enqueue(callBack);
    }
}
