package com.zhangxurui.javase.inherit;

public class HttpConnection {
	public interface HttpListener{
	public void onSuccess();
	void onFileNotExist();
	void onFailure();
	}
	public static void doLogin(int arg, HttpListener listener){
		if(arg==500){
		
		}
	}

}
