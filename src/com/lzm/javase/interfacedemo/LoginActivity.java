package com.lzm.javase.interfacedemo;

import java.util.Scanner;

import com.lzm.javase.interfacedemo.HttpConnection.HttpListener;

/**
 * 实现多个接口时，不同接口相同名方法都会进行实现。 
 */

public class LoginActivity implements HttpListener {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arg = scanner.nextInt();
		
		//（1）利用多态的形式进行调用
		HttpConnection.doLogin(arg, new LoginActivity());
		
		//（2）使用匿名内部类的形式进行调用
		HttpConnection.doLogin(arg, new HttpListener() {
			
			/**
			 * 内部实现
			 * 解决不同接口相同方法名
			 */
			@Override
			public void onSuccess() {
				System.out.println("onSuccess_2");
			}
			@Override
			public void onFileNotExist() {
				System.out.println("onFileNotExits_2");
			}
			@Override
			public void onFailure() {
				System.out.println("onFailure");
			}
		});
		
		scanner.close();
	
	}

	/**
	 * 外部实现
	 */
	
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
	
}
