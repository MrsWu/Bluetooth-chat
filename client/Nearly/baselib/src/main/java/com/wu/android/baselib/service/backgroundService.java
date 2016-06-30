package com.wu.android.baselib.service;

import android.content.Intent;

import com.wu.android.baselib.base.BaseIntentService;


/**
 * Created by Nowy on 2015/12/31.
 */
public class backgroundService extends BaseIntentService {


    public backgroundService(){
        super("bgService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        //1.获取当前账户
        //2.根据账户获取缓存数据库集合
        //3.获取缓存文件，并方法序列化
        //4.联网请求
        //5.成功更新数据库



    }
}
