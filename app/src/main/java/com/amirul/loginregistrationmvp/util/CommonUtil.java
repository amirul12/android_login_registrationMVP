package com.amirul.loginregistrationmvp.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class CommonUtil {

    public CommonUtil() {

    }


    public static void goToNextActivity(Context context, final Class<? extends Activity> targetActivity) {

        Intent intent = new Intent(context, targetActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

}
