package com.hehandong.loginmvp3.presenter;

import com.hehandong.loginmvp3.view.IView;

/**
 * @Author dong
 * @Date 2019-05-22 14:26
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public interface LoginContract {

    interface View extends IView {
        void onLoginSuccess(String result);
        void onLoginFailure(String result);
    }

    interface Presenter{
        void onLoginEvent(String parm1,String parm2);
    }
}
