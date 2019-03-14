package com.amirul.loginregistrationmvp.ui.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amirul.loginregistrationmvp.R;
import com.amirul.loginregistrationmvp.ui.base.BaseActivity;
import com.amirul.loginregistrationmvp.ui.login.MainActivity;
import com.amirul.loginregistrationmvp.util.CommonUtil;

public class RegistrationActivity extends BaseActivity implements RegistrationView, View.OnClickListener {

    private static final String TAG = "RegistrationActivity";

 
     private EditText userName, userEmail, userPass;
     private Button loginBtn, registrationBtn;

     RegistrationPresenter presenter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        
        initView();
        presenter = new RegistrationPresenter(this, this, getAppDataManager());
    }

    private void initView() {
        
        userName = (EditText)findViewById(R.id.et_regis_name);
        userEmail =(EditText)findViewById(R.id.et_regis_email);
        userPass = (EditText)findViewById(R.id.et_regis_pass);
        loginBtn = (Button)findViewById(R.id.btn_regis_login);
        registrationBtn = (Button)findViewById(R.id.btn_regis_regis);
        
        loginBtn.setOnClickListener(this);
        registrationBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_regis_regis:

                presenter.onRegistrationButtonClicked(userName.getText().toString(), userEmail.getText().toString(), userPass.getText().toString());
                Log.d(TAG, "onClick: registration button");
                break;
            case R.id.btn_regis_login:
                CommonUtil.goToNextActivity(this, MainActivity.class);
                Log.d(TAG, "onClick: Login button click");
                break;
        }
        
    }

    @Override
    public void showNameError(String msg) {
        userName.setError(msg);
    }

    @Override
    public void showEmailError(String msg) {

        userEmail.setError(msg);
    }

    @Override
    public void showPassEror(String msg) {

        userPass.setError(msg);
    }

    @Override
    public void showToastMsg(String msg) {

        Toast.makeText(this, ""+msg, Toast.LENGTH_SHORT).show();

    }
}
