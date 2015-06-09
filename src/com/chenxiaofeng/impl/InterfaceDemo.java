package com.chenxiaofeng.impl;

public class InterfaceDemo {
	public static void main(String[] args){
		LoginActivity la=new LoginActivity();
		HttpConnection.doLogin(la.getStatusCode(), la);
	}
}
