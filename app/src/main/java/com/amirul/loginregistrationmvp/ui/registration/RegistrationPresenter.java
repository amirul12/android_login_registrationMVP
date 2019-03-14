package com.amirul.loginregistrationmvp.ui.registration;

import android.content.Context;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class RegistrationPresenter implements RegistrationMpvPresenter {

    private Context context;
    private RegistrationView registrationView;
    private AppDataManager appDataManager;

    public RegistrationPresenter(Context context, RegistrationView registrationView, AppDataManager appDataManager) {
        this.context = context;
        this.registrationView = registrationView;
        this.appDataManager = appDataManager;
    }

    @Override
    public void onRegistrationButtonClicked(String name, String email, String pass) {

        if (name.isEmpty() || name == null) {
            registrationView.showNameError("Name can't be empty");
        } else if (email.isEmpty() || email == null) {
            registrationView.showEmailError("Email can't be empty");
        } else if (pass.isEmpty() || pass == null) {
            registrationView.showPassEror("Password can't be empty");
        } else {

            appDataManager.setUserName(name);
            appDataManager.setUserEmail(email);
            appDataManager.setUserPass(pass);
            registrationView.showToastMsg("Succesfully Registration");
        }

    }
}
