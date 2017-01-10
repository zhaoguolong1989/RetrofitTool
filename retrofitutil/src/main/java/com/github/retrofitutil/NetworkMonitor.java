package com.github.retrofitutil;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 2017/1/10.
 */
public class NetworkMonitor {
    private final Context applicationContext;

    public NetworkMonitor(Context context) {
        applicationContext = context.getApplicationContext();
    }
    public boolean isConnected() {
        ConnectivityManager cm =(ConnectivityManager) applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&activeNetwork.isConnectedOrConnecting();
    }
}
