package com.liduan.javase.interfacedemo;

import java.util.Scanner;

import com.liduan.javase.interfacedemo.HttpConnection.HttpListener;

/**
 * 
 * @author 
 *
 *	��������200��ӡ�ɹ�������404��ӡ�ļ������ڣ�����500��ӡ����ʧ��
 *	
 *	�������汾������ҵ����Ĵ���
 */
public class LoginActivity /*implements HttpListener, HttpListener1*/{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arg = sc.nextInt();
		HttpConnection hc = new HttpConnection();
		//hc.doLogin(arg, new LoginActivity(), new LoginActivity());
		
		hc.doLogin(arg, /*�����ڲ���*/new HttpListener() {
			
			@Override
			public void onSuccess() {
				System.out.println("onSuccess()");
			}
			
			@Override
			public void onFileNotExist() {
				
			}
			
			@Override
			public void onFailure() {
				
			}
		}, new HttpConnectionImpl());
	}

//	@Override
//	public void onSuccess() {
//		System.out.println("onSuccess()");
//	}
//
//	@Override
//	public void onFailure() {
//		System.out.println("onFailure()");
//	}
//
//	@Override
//	public void onFileNotExist() {
//		System.out.println("onFileNotExist()");
//	}
	

}
