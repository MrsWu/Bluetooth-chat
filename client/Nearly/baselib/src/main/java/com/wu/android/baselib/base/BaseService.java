package com.wu.android.baselib.base;

import android.app.Service;

import com.wu.android.baselib.app.AppServices;


public abstract class BaseService extends Service {

	@Override
	public void onCreate() {
		super.onCreate();

		AppServices.addService(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		AppServices.removeService(this);
	}
}
