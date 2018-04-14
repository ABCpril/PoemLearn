package com.roshine.poemlearn.base;

import android.os.Bundle;

/**
 * @author Roshine
 * @date 2018/4/14 21:19
 * @blog http://www.roshine.xyz
 * @email roshines1016@gmail.com
 * @github https://github.com/Roben1016
 * @phone 136****1535
 * @desc
 */
public interface BaseView {
    void showProgress();
    void showProgress(String message);
    void showProgress(String message, boolean cancelable);
    void hideProgress();
    void toast(String message);
    void toastLong(String message);
    void toastWithTime(int time, String message);
    void startActivity(Class<?> clz);
    void startActivity(Class<?> clz, Bundle bundle);
    void startActivityForResult(Class<?> cls, Bundle bundle, int requestCode);
}
