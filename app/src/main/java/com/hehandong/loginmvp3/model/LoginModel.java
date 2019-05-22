package com.hehandong.loginmvp3.model;

import com.hehandong.loginmvp3.CallBack;

/**
 * @Author dong
 * @Date 2019-05-22 14:30
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public class LoginModel implements ILoginModel {
    @Override
    public void loginEvent(String parm1, String parm2, CallBack callBack) {

        if (parm1.equals("123") && parm2.equals("123")) {
            callBack.onSuccess("登录成功");
        } else {
            callBack.onFailure("登录失败");
        }

    }
}
