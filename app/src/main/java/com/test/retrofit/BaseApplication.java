package com.test.retrofit;

import android.app.Application;

import com.github.retrofitutil.NetWorkManager;

/**
 * Created by Administrator on 2017/1/9.
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        NetWorkManager.getInstance(this,"http://61.152.255.241:8082/sales-web/",true);
    }

}
