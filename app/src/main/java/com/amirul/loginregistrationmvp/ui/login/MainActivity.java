package com.amirul.loginregistrationmvp.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amirul.loginregistrationmvp.R;
import com.amirul.loginregistrationmvp.ui.base.BaseActivity;
import com.amirul.loginregistrationmvp.ui.registration.RegistrationActivity;
import com.amirul.loginregistrationmvp.util.CommonUtil;

public class MainActivity extends BaseActivity implements MainActivityView , View.OnClickListener {

    private EditText userEmail, userPass;
    private Button login, registration;

    private static final String TAG = "MainActivity";

    private MainActivityPresenter presenter;

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_login_login:

                presenter.onLoginSumbitClicked(userEmail.getText().toString(), userPass.getText().toString());

                break;
            case R.id.btn_login_registration:


                CommonUtil.goToNextActivity(this, RegistrationActivity.class);


                break;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this, this,getAppDataManager());


        initView();


    }

    private void initView() {
        userEmail = (EditText) findViewById(R.id.et_login_email);
        userPass = (EditText) findViewById(R.id.et_login_pass);
        login = (Button) findViewById(R.id.btn_login_login);
        login.setOnClickListener(this);
        registration = (Button) findViewById(R.id.btn_login_registration);
        registration.setOnClickListener(this);
    }


    @Override
    public void showEmailError(String msg) {


        userEmail.setError(msg);

    }

    @Override
    public void showPassError(String msg) {

        userPass.setError(msg);

    }

    @Override
    public void showToastMed(String msg) {
        Toast.makeText(this, ""+msg, Toast.LENGTH_SHORT).show();

    }


}
