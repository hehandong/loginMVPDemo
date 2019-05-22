package com.hehandong.loginmvp3.presenter;

import com.hehandong.loginmvp3.view.IView;

/**
 * @Author dong
 * @Date 2019-05-22 14:13
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public interface IPresenter<V extends IView> {
    void attachView(V view);
    void detachView();
    boolean isViewAttached();
}
