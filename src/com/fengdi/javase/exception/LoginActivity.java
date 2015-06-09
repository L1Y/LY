package com.fengdi.javase.exception;

import java.util.Scanner;

import com.fengdi.javase.exception.HttpConnection.HttpListener;

public class LoginActivity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		HttpConnection c = new HttpConnection();
		c.doLogin(num, new HttpListener(){

			@Override
			public void onSuccess() {
				System.out.println("���ӳɹ�");
				
			}

			@Override
			public void onFailure() {
				System.out.println("����ʧ��");
				
			}

			@Override
			public void onFileNotExist() {
				System.out.println("ҳ�治����");
				
			}
			
		});
	}
}
