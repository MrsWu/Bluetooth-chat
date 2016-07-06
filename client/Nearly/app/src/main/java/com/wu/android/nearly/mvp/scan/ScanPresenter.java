package com.wu.android.nearly.mvp.scan;

import com.wu.android.nearly.data.BaseData;

import java.util.List;

/**
 * Created by Nowy on 2016/7/6.
 */
public class ScanPresenter implements ScanContract.Presenter {

    private ScanContract.View mScanView ;
    private BaseData<List<String>> mDataSource;

    public ScanPresenter(BaseData<List<String>> dataSource,ScanContract.View scanView){
        this.mDataSource  = dataSource;
        this.mScanView = scanView;
        scanView.setPresenter(this);
    }


    @Override
    public void start() {
        loadData();
    }


    private void loadData(){}
}
