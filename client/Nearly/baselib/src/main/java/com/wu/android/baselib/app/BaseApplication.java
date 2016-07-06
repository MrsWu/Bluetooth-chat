package com.wu.android.baselib.app;

import android.app.Application;

/**
 * Created by Nowy on 2016/7/6.
 */
public class BaseApplication extends Application {
    private static BaseApplication instance;
    //状态栏颜色
    int statusColor;
    //底部导航栏颜色
    int navColor;
    //是否是黑色模式（小米和魅族有效）
    boolean darkmode;
    public boolean requireStatusColor;



    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }


    public static BaseApplication getInstance(){
        return instance;
    }


    /**
     * 配置状态栏颜色
     * @return
     */
    public int getStatusColor() {
        return statusColor;
    }

    public int getNavColor() {
        return navColor;
    }

    public boolean isDarkmode() {
        return darkmode;
    }

}
