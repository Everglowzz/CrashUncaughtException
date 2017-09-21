package com.everglow.crashuncaughtexception;
import android.app.Application;

/**
 * Created by EverGlow on 2017/9/21 10:01
 */

public    class CrashApplication extends Application   {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
