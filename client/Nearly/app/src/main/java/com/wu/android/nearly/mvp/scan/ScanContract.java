package com.wu.android.nearly.mvp.scan;

import com.wu.android.nearly.mvp.base.BasePresenter;
import com.wu.android.nearly.mvp.base.BaseView;

import java.util.List;

/**
 * Created by Nowy on 2016/7/6.
 *
 */
public interface ScanContract {

    interface View extends BaseView<Presenter>{

        void showList(List data);
        void showLoading();
        void showLoadError(String msg);
    }


    interface Presenter extends BasePresenter{

    }
}
