package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * com.coolweather.android
 * Created by kevin on 2017/5/18.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        Context applicationContext = getApplicationContext();
        context=getApplicationContext();
        LitePal.initialize(context);
        super.onCreate();
    }
    public static Context getContext(){
        return context;
    }
}
