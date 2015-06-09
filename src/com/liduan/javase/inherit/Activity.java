package com.liduan.javase.inherit;

public abstract class Activity {
	
	public Activity(){
		init();
	}
	
	private void init(){
		onCreate();
		initUI();
		initData();
	}
	
	abstract void onCreate();//启动方法
	abstract void onDestroyed();//销毁方法
	abstract void initUI();//初始化UI方法
	abstract void initData();//初始化数据方法
}
