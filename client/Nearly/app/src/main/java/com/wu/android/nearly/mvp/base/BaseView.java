package com.wu.android.nearly.mvp.base;

/**
 * Created by Nowy on 2016/7/6.
 */
public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
