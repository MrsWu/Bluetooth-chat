package com.wu.android.baselib.base;

import android.app.IntentService;

import com.wu.android.baselib.app.AppServices;


public abstract class BaseIntentService extends IntentService {

	public BaseIntentService(String name) {
		super(name);
	}

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
