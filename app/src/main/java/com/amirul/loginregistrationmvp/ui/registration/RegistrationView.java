package com.amirul.loginregistrationmvp.ui.registration;

public interface RegistrationView {

    void showNameError(String msg);
    void showEmailError(String msg);
    void showPassEror(String msg);
    void showToastMsg(String msg);

}
