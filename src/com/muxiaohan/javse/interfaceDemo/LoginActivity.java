package com.muxiaohan.javse.interfaceDemo;

import java.util.Scanner;

import com.muxiaohan.javse.interfaceDemo.HttpConnection.HttpListener;



public class LoginActivity implements HttpListener{

	@Override
	public void onSuccess() {
		System.out.println("��ӡ�ɹ�����");
		
	}

	@Override
	public void onFileNotExit() {
		System.out.println("ҳ�治����!!");
		
	}

	@Override
	public void onFailure() {
		System.out.println("����ʧ�ܣ���");
		
	}
	public static void main(String[] args){
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HttpConnection HC = new HttpConnection();
		HttpListener HL = new LoginActivity();
		HC.dologin(num, HL);
		}
	
}
