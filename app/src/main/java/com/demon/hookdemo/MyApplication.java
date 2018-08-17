package com.demon.hookdemo;

import android.app.Application;

import com.demon.hookdemo.util.HookUtil;

/**
 * @author DeMon
 * @date 2018/8/8
 * @description
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HookUtil hookUtil = new HookUtil(MainActivity.class, this);
        hookUtil.hookAms();
    }
}
