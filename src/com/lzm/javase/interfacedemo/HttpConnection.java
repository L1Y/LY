package com.lzm.javase.interfacedemo;

public class HttpConnection {
	
	//�ڲ���/�ڲ��ӿ�
	//�����ڲ�����չ
	interface HttpListener {
		void onSuccess();
		void onFileNotExist();
		void onFailure();
	}
	
	//������һ������
	//�������е��߼�
	public static void doLogin(int arg, HttpListener listener) {
		if (200 == arg) {
			listener.onSuccess();
		} else if (404 == arg) {
			listener.onFileNotExist();
		} else if (500 == arg) {
			listener.onFailure();
		}
	}

}
