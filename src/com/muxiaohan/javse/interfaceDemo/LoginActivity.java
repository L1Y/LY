package com.muxiaohan.javse.interfaceDemo;

import java.util.Scanner;

import com.muxiaohan.javse.interfaceDemo.HttpConnection.HttpListener;



public class LoginActivity implements HttpListener{

	@Override
	public void onSuccess() {
		System.out.println("打印成功！！");
		
	}

	@Override
	public void onFileNotExit() {
		System.out.println("页面不存在!!");
		
	}

	@Override
	public void onFailure() {
		System.out.println("连接失败！！");
		
	}
	public static void main(String[] args){
		System.out.println("请输入你的数字");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HttpConnection HC = new HttpConnection();
		HttpListener HL = new LoginActivity();
		HC.dologin(num, HL);
		}
	
}
