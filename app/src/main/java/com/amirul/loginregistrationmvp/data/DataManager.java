package com.amirul.loginregistrationmvp.data;

import com.amirul.loginregistrationmvp.data.prefs.PreferencesHelper;

public interface DataManager extends PreferencesHelper {

    void updateUserInfo(
            boolean userLoggedIn,
            String userName,
            String userEmail,
            String userPass
    );
}
