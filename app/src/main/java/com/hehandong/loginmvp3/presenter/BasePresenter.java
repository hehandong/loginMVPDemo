package com.hehandong.loginmvp3.presenter;

import com.hehandong.loginmvp3.presenter.IPresenter;
import com.hehandong.loginmvp3.view.IView;

/**
 * @Author dong
 * @Date 2019-05-22 14:16
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public class BasePresenter<V extends IView> implements IPresenter<V> {
    protected V mView;
    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mView == null ? false : true;
    }
}
