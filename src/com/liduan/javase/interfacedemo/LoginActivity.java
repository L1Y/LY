package com.liduan.javase.interfacedemo;

import java.util.Scanner;

import com.liduan.javase.interfacedemo.HttpConnection.HttpListener;

/**
 * 
 * @author 
 *
 *	需求：输入200打印成功，输入404打印文件不存在，输入500打印连接失败
 *	
 *	第三个版本，简化了业务类的代码
 */
public class LoginActivity /*implements HttpListener, HttpListener1*/{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arg = sc.nextInt();
		HttpConnection hc = new HttpConnection();
		//hc.doLogin(arg, new LoginActivity(), new LoginActivity());
		
		hc.doLogin(arg, /*匿名内部类*/new HttpListener() {
			
			@Override
			public void onSuccess() {
				System.out.println("onSuccess()");
			}
			
			@Override
			public void onFileNotExist() {
				
			}
			
			@Override
			public void onFailure() {
				
			}
		}, new HttpConnectionImpl());
	}

//	@Override
//	public void onSuccess() {
//		System.out.println("onSuccess()");
//	}
//
//	@Override
//	public void onFailure() {
//		System.out.println("onFailure()");
//	}
//
//	@Override
//	public void onFileNotExist() {
//		System.out.println("onFileNotExist()");
//	}
	

}
