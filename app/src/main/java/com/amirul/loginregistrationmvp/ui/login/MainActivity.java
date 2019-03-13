package com.amirul.loginregistrationmvp.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amirul.loginregistrationmvp.R;
import com.amirul.loginregistrationmvp.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void showEmailError(String msg) {

    }

    @Override
    public void showPassError(String msg) {

    }

    @Override
    public void showToastMed(String msg) {

    }
}
