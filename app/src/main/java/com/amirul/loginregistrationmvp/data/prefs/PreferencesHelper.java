package com.amirul.loginregistrationmvp.data.prefs;

public interface PreferencesHelper {

    boolean isUerLoginedIn();
    void setUserLoginedIn(boolean isUserLoginedIn);

    String getUserName();
    void setUserName(String userName);

    String getUserEmail();
    void setUserEmail(String userEmail);

    String getUserPass();
    void setUserPass(String userPass);
}
