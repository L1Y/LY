package com.lzm.javase.interfacedemo;

import java.util.Scanner;

import com.lzm.javase.interfacedemo.HttpConnection.HttpListener;

/**
 * ʵ�ֶ���ӿ�ʱ����ͬ�ӿ���ͬ�������������ʵ�֡� 
 */

public class LoginActivity implements HttpListener {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arg = scanner.nextInt();
		
		//��1�����ö�̬����ʽ���е���
		HttpConnection.doLogin(arg, new LoginActivity());
		
		//��2��ʹ�������ڲ������ʽ���е���
		HttpConnection.doLogin(arg, new HttpListener() {
			
			/**
			 * �ڲ�ʵ��
			 * �����ͬ�ӿ���ͬ������
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
	 * �ⲿʵ��
	 */
	
	@Override
	public void onSuccess() {
		System.out.println("���ӳɹ�");
	}
	@Override
	public void onFileNotExist() {
		System.out.println("ҳ�治����");
	}
	@Override
	public void onFailure() {
		System.out.println("����ʧ��");
	}
	
}
