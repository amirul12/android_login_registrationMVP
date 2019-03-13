package com.amirul.loginregistrationmvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.amirul.loginregistrationmvp.data.AppDataManager;

public class BaseFragment extends Fragment {

    AppDataManager appDataManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appDataManager = new AppDataManager(getActivity());
    }

    public AppDataManager getAppDataManager(){
        return appDataManager;
    }
}
