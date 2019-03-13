package com.amirul.loginregistrationmvp.ui.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class BaseActivity extends AppCompatActivity {


    private AppDataManager appDataManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appDataManager = new AppDataManager(this);

    }

    public AppDataManager getAppDataManager() {
        return appDataManager;
    }
}
