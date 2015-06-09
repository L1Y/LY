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
	
	abstract void onCreate();//��������
	abstract void onDestroyed();//���ٷ���
	abstract void initUI();//��ʼ��UI����
	abstract void initData();//��ʼ�����ݷ���
}
