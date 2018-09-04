package com.example.leya9.pillservice;

import android.app.Application;

import com.example.leya9.pillservice.di.application.AppComponent;
import com.example.leya9.pillservice.di.login.LoginComponent;

public class App extends Application {
    private static App app;
    private AppComponent appComponent;
    private LoginComponent loginComponent;

    public App() {
        app = this;
    }

    public static App getApp() {
        return app;
    }
}
