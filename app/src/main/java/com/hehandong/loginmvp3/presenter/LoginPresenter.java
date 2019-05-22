package com.hehandong.loginmvp3.presenter;

import com.hehandong.loginmvp3.CallBack;
import com.hehandong.loginmvp3.model.ILoginModel;
import com.hehandong.loginmvp3.model.LoginModel;

/**
 * @Author dong
 * @Date 2019-05-22 14:33
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {

    private final ILoginModel mLoginModel;

    public LoginPresenter() {
        mLoginModel = new LoginModel();
    }

    @Override
    public void onLoginEvent(String parm1, String parm2) {

        mLoginModel.loginEvent(parm1, parm2, new CallBack<String,String>() {
            @Override
            public void onSuccess(String result) {
                if (isViewAttached()){
                    mView.onLoginSuccess(result);
                }
            }

            @Override
            public void onFailure(String result) {
                if (isViewAttached()){
                    mView.onLoginFailure(result);
                }
            }
        });
    }
}
