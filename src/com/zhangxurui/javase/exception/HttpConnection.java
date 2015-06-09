package com.zhangxurui.javase.exception;

public class HttpConnection {
	public void doLogin(int arg,HttpListener listener){
		if(arg==200){
			listener.onSuccess();
		}
		if(arg==404){
			listener.onFileNotExist();
		}
		if(arg==500){
			listener.onFailure();
		}
	}
//	public void onSuccess(){
//		System.out.println("连接成功!");
//	}
//	public void onFileNotExist(){
//		System.out.println("页面不存在!");
//	}
//	public void onFailure(){
//		System.out.println("连接失败!");
//	}
	
	/*
	 * 定义接口
	 */
	public interface HttpListener{
		void onSuccess();
		void onFileNotExist();
		void onFailure();
	}
	public interface HttpListener1{
		void onSuccess();
	}
	public void doLogin(int arg,HttpListener listener,HttpListener1 listener1){
		doLogin(arg,listener);
		listener1.onSuccess();
	}
}

