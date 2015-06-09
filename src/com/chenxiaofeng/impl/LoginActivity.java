package com.chenxiaofeng.impl;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LoginActivity implements HttpListener {
	private int statusCode;

	public LoginActivity(){
		Scanner input=new Scanner(System.in);
		System.out.println("输入连接状态");
		try{
			statusCode=input.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("不合法的错误状态码");
			statusCode=0;
		}
		finally{
			input.close();
		}
	}
	public void onFailure() {
		System.out.println("连接失败");
	}

	public void onFileNotExist() {
		System.out.println("所访问的文件不存在");
	}

	public void onSuccess() {
		System.out.println("连接成功");

	}
	
	public int getStatusCode(){
		return statusCode;
	}

}
