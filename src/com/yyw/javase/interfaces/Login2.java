package com.yyw.javase.interfaces;

import java.util.Scanner;
import com.yyw.javase.interfaces.HttpConnection.HttpListener;
import com.yyw.javase.interfaces.HttpConnection.HttpListener1;

public class Login2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int arg = in.nextInt();
		HttpConnection hc = new HttpConnection();
		hc.doLogin(arg, /*匿名内部类*/new HttpListener(){
			public void onFailure() {
				System.out.println("onFailure()");
			}

			public void onFileNotExist() {
				System.out.println("onFileNotExist()");
			}

			public void onSuccess() {
				System.out.println("onSuccess()");
			}
		},new HttpListener1(){
			public void onSuccess() {
				System.out.println("onSuccess1()");
			}
		});
	}
}
