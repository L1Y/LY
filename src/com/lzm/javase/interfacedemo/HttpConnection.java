package com.lzm.javase.interfacedemo;

public class HttpConnection {
	
	//内部类/内部接口
	//功能内部的拓展
	interface HttpListener {
		void onSuccess();
		void onFileNotExist();
		void onFailure();
	}
	
	//类似于一个引擎
	//定义运行的逻辑
	public static void doLogin(int arg, HttpListener listener) {
		if (200 == arg) {
			listener.onSuccess();
		} else if (404 == arg) {
			listener.onFileNotExist();
		} else if (500 == arg) {
			listener.onFailure();
		}
	}

}
