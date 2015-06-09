package com.wangzexin.javase.inerfacedemo;

import java.util.Scanner;

import com.wangzexin.javase.inerfacedemo.HttpConnection.HttpListenner;



public class LoginActivity implements HttpListenner{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int arg = scanner.nextInt();
		HttpConnection hc = new HttpConnection();
		hc.doLogin(arg, new LoginActivity());
		scanner.close();
	}
	
	@Override
	public void onSuccess() {
		// TODO Auto-generated method stub
		System.out.println("onSuccess()");
	}

	@Override
	public void onFileNotExist() {
		// TODO Auto-generated method stub
		System.out.println("onFileNotExist()");
	}

	@Override
	public void onFailure() {
		// TODO Auto-generated method stub
		System.out.println("OnFailure()");
	}
    
	

}
