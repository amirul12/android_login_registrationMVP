package com.amirul.loginregistrationmvp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class AppPreferenceHelper implements PreferencesHelper {
    private static final String TAG = "AppPreferenceHelper";

    private Context mContext;
    private final SharedPreferences prefs;

    private static final String PREF_KEY_NAME = "user_info";
    private static final String PREF_KEY_USER_LOGIN = "PREF_KEY_USER_LOGIN";
    private static final String PREF_KEY_USER_NAME = "PREF_KEY_USER_NAME";
    private static final String PREF_KEY_USER_EMAIL = "PREF_KEY_USER_EMAIL";
    private static final String PREF_KEY_USER_PASS = "PREF_KEY_USER_PASS";

    public AppPreferenceHelper(Context context) {
        this.mContext = context;
        prefs = mContext.getSharedPreferences(PREF_KEY_NAME, Context.MODE_PRIVATE);
    }


    @Override
    public boolean isUerLoginedIn() {
        return prefs.getBoolean(PREF_KEY_USER_LOGIN, false);
    }

    @Override
    public void setUserLoginedIn(boolean isUserLoginedIn) {

        prefs.edit().putBoolean(PREF_KEY_USER_LOGIN, isUserLoginedIn).apply();
    }

    @Override
    public String getUserName() {
        return prefs.getString(PREF_KEY_USER_NAME, "");
    }

    @Override
    public void setUserName(String userName) {
        Log.d(TAG, "setUserName: "+userName);

        prefs.edit().putString(PREF_KEY_USER_NAME, userName).apply();

    }

    @Override
    public String getUserEmail() {
        Log.d(TAG, "getUserEmail: ");
        return prefs.getString(PREF_KEY_USER_EMAIL,"");
    }

    @Override
    public void setUserEmail(String userEmail) {
        Log.d(TAG, "setUserEmail: "+userEmail);

        prefs.edit().putString(PREF_KEY_USER_EMAIL,userEmail).apply();
    }

    @Override
    public String getUserPass() {
        Log.d(TAG, "getUserPass: ");
        return prefs.getString(PREF_KEY_USER_PASS, "");
    }

    @Override
    public void setUserPass(String userPass) {

        prefs.edit().putString(PREF_KEY_USER_PASS, userPass).apply();

    }
}
