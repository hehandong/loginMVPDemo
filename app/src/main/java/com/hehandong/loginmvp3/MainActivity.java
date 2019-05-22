package com.hehandong.loginmvp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.hehandong.loginmvp3.presenter.LoginContract;
import com.hehandong.loginmvp3.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginContract.View {

    private LoginPresenter mLoginPresenter;
    private EditText mUserEt;
    private EditText mPwdEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initPresenter();

    }


    public void initPresenter() {
        mLoginPresenter = new LoginPresenter();
        if (mLoginPresenter != null) {
            mLoginPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mLoginPresenter != null) {
            mLoginPresenter.detachView();
        }
    }


    public void initView() {
        mUserEt = findViewById(R.id.et_user);
        mPwdEt = findViewById(R.id.et_pwd);
        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mUserEt.getText().toString().trim();
                String pwd = mPwdEt.getText().toString().trim();
                if (mLoginPresenter != null) {
                    mLoginPresenter.onLoginEvent(user, pwd);
                }

            }
        });
    }

    @Override
    public void onLoginSuccess(String result) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginFailure(String result) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
