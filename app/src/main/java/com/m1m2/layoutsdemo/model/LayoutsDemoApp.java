package com.m1m2.layoutsdemo.model;

import android.app.Application;
import android.util.Log;

/**
 * Created by vinayreddypolati on 2/11/17.
 */

public class LayoutsDemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Welcome"," App just started");
    }
}
