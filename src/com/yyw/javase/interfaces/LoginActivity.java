package com.yyw.javase.interfaces;

import java.util.Scanner;

import com.yyw.javase.interfaces.HttpConnection.HttpListener;

public class LoginActivity implements HttpListener{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɷ������

		
		Scanner in = new Scanner(System.in);
		int arg = in.nextInt();
		HttpConnection listener = new HttpConnection();
		listener.doLogin(arg, new LoginActivity());
	}

	public void onFailure() {
		// TODO �Զ����ɷ������
		System.out.println("onFailure()");
	}

	public void onFileNotExist() {
		// TODO �Զ����ɷ������
		System.out.println("onFileNotExist()");
	}

	public void onSuccess() {
		// TODO �Զ����ɷ������
		System.out.println("onSuccess()");
	}

}
