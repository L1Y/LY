package com.guzhijie.javase.interfacedemo;

import java.util.Scanner;

import com.guzhijie.javase.interfacedemo.HttpConnection.HttpListener;



public class LoginActivity implements HttpListener{

	@Override
	public void onSuccess() {
		System.out.println("连接成功");		
	}

	@Override
	public void onFileNotExist() {
		System.out.println("页面不存在");
	}

	@Override
	public void onFailure() {
		System.out.println("连接失败");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		HttpConnection login = new HttpConnection();
		login.doLogin(temp, new LoginActivity());
	}
}

	

