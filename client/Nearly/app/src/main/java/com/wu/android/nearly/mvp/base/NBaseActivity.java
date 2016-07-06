package com.wu.android.nearly.mvp.base;

import android.os.Bundle;

import com.wu.android.baselib.base.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by Nowy on 2016/7/6.
 */
public class NBaseActivity extends BaseActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }


}
