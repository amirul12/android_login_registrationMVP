package com.amirul.loginregistrationmvp.ui.login;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class MainActivityPresenter implements MainActivityMvpPresenter {
    private static final String TAG = "MainActivityPresenter";


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

        Log.d(TAG, "onLoginSumbitClicked: "+appDataManager.getUserEmail());


        if (email.isEmpty() || email == null) {
            activityView.showEmailError("Email cann't be empty");

        } else if (pass.isEmpty() || pass == null) {
            activityView.showPassError("Password can't be empty");
        }else if (appDataManager.getUserEmail()== null || appDataManager.getUserPass()== null){
            activityView.showToastMed("Please RegistrationActivity Firt");

        }else if (appDataManager.getUserEmail().equals(email) && appDataManager.getUserPass().equals(pass)){
            activityView.showToastMed("Welcome "+appDataManager.getUserName());
        }else if (!appDataManager.getUserEmail().equals(email) || !appDataManager.getUserPass().equals(pass)){
            activityView.showToastMed("Email and pass does not matched ");
        }
    }
}
