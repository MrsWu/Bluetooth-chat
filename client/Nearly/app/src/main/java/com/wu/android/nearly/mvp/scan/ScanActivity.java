package com.wu.android.nearly.mvp.scan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.wu.android.nearly.R;
import com.wu.android.nearly.biz.TestData;
import com.wu.android.nearly.mvp.base.NBaseActivity;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Nowy on 2016/7/6.
 * <p/>
 * 扫描附近蓝牙，并以列表展示
 */

public class ScanActivity extends NBaseActivity implements ScanContract.View {


    @BindView(R.id.title_TbBar)
    Toolbar mTbBar;
    @BindView(R.id.title_AbLayout)
    AppBarLayout mAbLayout;
    @BindView(R.id.scan_RvList)
    RecyclerView mRvList;
    @BindView(R.id.scan_SrlRefresh)
    SwipeRefreshLayout mSrlRefresh;



    private ScanContract.Presenter mScanPresenter;


    public static void start(Context context){
        context.startActivity(new Intent(context,ScanActivity.class));
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        this.mScanPresenter = new ScanPresenter(new TestData(), this);
    }

    private void setupUI() {

    }


    @Override
    public void showList(List data) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showLoadError(String msg) {

    }

    @Override
    public void setPresenter(ScanContract.Presenter presenter) {

    }
}
