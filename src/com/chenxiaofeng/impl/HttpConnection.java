package com.chenxiaofeng.impl;

public class HttpConnection {
	
	public static void doLogin(int arg,HttpListener listener){
		switch(arg){
		case 500:listener.onSuccess();break;
		case 404:listener.onFileNotExist();break;
		case 200:listener.onFailure();break;
		default:System.out.println("Î´ÖªµÄ´íÎó");
		}
	}
}
