package com.hehandong.loginmvp3.model;

import com.hehandong.loginmvp3.CallBack;

/**
 * @Author dong
 * @Date 2019-05-22 14:20
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public interface ILoginModel extends IModel {
    void loginEvent(String parm1, String parm2, CallBack callBack);
}
