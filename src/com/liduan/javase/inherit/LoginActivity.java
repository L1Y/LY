package com.liduan.javase.inherit;

public class LoginActivity extends Activity{

	@Override
	void onCreate() {
		System.out.println("onCreate()");
	}

	@Override
	void onDestroyed() {
		System.out.println("onDestroyed()");
	}

	@Override
	void initUI() {
		System.out.println("initUI()");
	}

	@Override
	void initData() {
		System.out.println("initData()");
	}

}
