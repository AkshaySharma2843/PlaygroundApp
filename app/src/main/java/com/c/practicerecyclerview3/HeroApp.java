package com.c.practicerecyclerview3;

import android.app.Application;

public class HeroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        createSharedPreferences();
    }

    private void createSharedPreferences() {

    }
}
