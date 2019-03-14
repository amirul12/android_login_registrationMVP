package com.amirul.loginregistrationmvp;

import android.app.Application;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class LoginRegistration extends Application {

private AppDataManager appDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        appDataManager = new AppDataManager(this);
    }



    public AppDataManager getAppDataManager(){
        return appDataManager;
    }
}
