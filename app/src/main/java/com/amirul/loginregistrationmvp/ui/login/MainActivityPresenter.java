package com.amirul.loginregistrationmvp.ui.login;

import android.content.Context;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class MainActivityPresenter implements MainActivityMvpPresenter{


    private Context mContext;
    private MainActivityView activityView;
    private AppDataManager appDataManager;

    public MainActivityPresenter(Context mContext, MainActivityView activityView, AppDataManager appDataManager) {
        this.mContext = mContext;
        this.activityView = activityView;
        this.appDataManager = appDataManager;
    }

    @Override
    public void onLoginSumbitClicked(String email, String pass) {


        if (email.isEmpty() || email == null){
            activityView.showEmailError("Email cann't be empty");

        }else if (pass.isEmpty() || pass == null){
            activityView.showPassError("Password can't be empty");
        }else {

            if (appDataManager.getUserEmail().equals(email) && appDataManager.getUserPass().equals(pass)){

                activityView.showToastMed("Logged In succesfully");

            }else {
                activityView.showToastMed("UserName and Pass doesNot matched");
            }

        }

    }
}
