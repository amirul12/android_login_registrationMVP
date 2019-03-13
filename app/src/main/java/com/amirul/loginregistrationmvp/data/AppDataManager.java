package com.amirul.loginregistrationmvp.data;

import android.content.Context;

import com.amirul.loginregistrationmvp.data.prefs.AppPreferenceHelper;

public class AppDataManager implements DataManager {

    private Context mContext;

    private AppPreferenceHelper appPreferenceHelper;

    public AppDataManager(Context mContext) {
        this.mContext = mContext;
        this.appPreferenceHelper = new AppPreferenceHelper(mContext);
    }


    @Override
    public void updateUserInfo(boolean userLoggedIn,
                               String userName,
                               String userEmail,
                               String userPass) {

        appPreferenceHelper.setUserLoginedIn(userLoggedIn);
        appPreferenceHelper.setUserName(userName);
        appPreferenceHelper.setUserEmail(userEmail);
        appPreferenceHelper.setUserPass(userPass);

    }

    @Override
    public boolean isUerLoginedIn() {
        return appPreferenceHelper.isUerLoginedIn();
    }

    @Override
    public void setUserLoginedIn(boolean isUserLoginedIn) {

        appPreferenceHelper.setUserLoginedIn(isUserLoginedIn);

    }

    @Override
    public String getUserName() {
        return appPreferenceHelper.getUserName();
    }

    @Override
    public void setUserName(String userName) {

        appPreferenceHelper.setUserName(userName);
    }

    @Override
    public String getUserEmail() {
        return appPreferenceHelper.getUserEmail();
    }

    @Override
    public void setUserEmail(String userEmail) {

        appPreferenceHelper.setUserEmail(userEmail);
    }

    @Override
    public String getUserPass() {
        return appPreferenceHelper.getUserPass();
    }

    @Override
    public void setUserPass(String userPass) {

        appPreferenceHelper.setUserPass(userPass);
    }
}
