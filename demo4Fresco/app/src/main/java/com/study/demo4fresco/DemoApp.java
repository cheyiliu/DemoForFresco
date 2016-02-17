package com.study.demo4fresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by hsy on 2016/2/17.
 */
public class DemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
