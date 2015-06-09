package com.guzhijie.javase.interfacedemo;

public class HttpConnection{
	
	public static void doLogin(int temp, HttpListener listener){
		if(temp == 200){
			listener.onSuccess();
		}else if(temp ==404){
			listener.onFileNotExist();
		}else if(temp == 500){
			listener.onFailure();
		}
	}
	public interface HttpListener {
		public void onSuccess();
		public void onFileNotExist();
		public void onFailure();
	}
}
