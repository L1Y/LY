package com.zhangxurui.javase.exception;

import java.util.Scanner;

import com.zhangxurui.javase.exception.HttpConnection.HttpListener;
import com.zhangxurui.javase.exception.HttpConnection.HttpListener1;
public  class LoginActivity /*implements HttpListener*/ {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arg;
		try{
			System.out.println("请输入:");
			arg = sc.nextInt();
			HttpConnection hp = new HttpConnection();
			//匿名内部类
			hp.doLogin(arg, new HttpListener(){
	
				@Override
				public void onSuccess() {
					// TODO Auto-generated method stub
					System.out.println("连接成功");
				}
	
				@Override
				public void onFileNotExist() {
					// TODO Auto-generated method stub
					System.out.println("页面不存在");
				}
	
				@Override
				public void onFailure() {
					// TODO Auto-generated method stub
					System.out.println("连接失败");
				}
				
			},new HttpListener1(){
				public void onSuccess(){
					System.out.println("连接成功1");
				}
			});
		}catch(Exception e){
			System.out.println("输入有误，请输入202,404,或500");
		}
		sc.close();
		
	}

//	@Override
//	public void onSuccess() {
//		// TODO Auto-generated method stub
//		System.out.println("连接成功");
//	}
//
//	@Override
//	public void onFileNotExist() {
//		// TODO Auto-generated method stub
//		System.out.println("页面不存在");
//	}
//
//	@Override
//	public void onFailure() {
//		// TODO Auto-generated method stub
//		System.out.println("连接失败");
//	}
	
	
}
