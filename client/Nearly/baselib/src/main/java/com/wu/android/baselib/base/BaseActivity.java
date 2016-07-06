package com.wu.android.baselib.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wu.android.baselib.app.AppActivities;
import com.wu.android.baselib.app.BaseApplication;
import com.wu.android.baselib.utils.AppUtil;


/**
 * Created by Nowy on 2015/12/30.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppActivities.pushActivity(this);

    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }



    /**
     * 设置状态栏，默认为Appliation
     */
    protected void setStatusBar() {
        if(BaseApplication.getInstance().requireStatusColor){
//            StatusBarUtil.setColorNoTranslucent(this, ABApplication.getInstance().getStatusColor(),ABApplication.getInstance().isDarkmode());
            AppUtil.setStatusImmerse(this, BaseApplication.getInstance().getStatusColor(),
                    BaseApplication.getInstance().getStatusColor(),
                    BaseApplication.getInstance().isDarkmode());
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        AppActivities.setCurrentActivity(this);
    }

    @Override
    protected void onDestroy() {
        AppActivities.removeActivity(this);
        super.onDestroy();
    }
}
