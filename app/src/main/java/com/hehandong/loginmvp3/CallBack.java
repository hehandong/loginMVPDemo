package com.hehandong.loginmvp3;

/**
 * @Author dong
 * @Date 2019-05-22 14:21
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */
public interface CallBack<K, V> {
    void onSuccess(K result);

    void onFailure(V result);

}
