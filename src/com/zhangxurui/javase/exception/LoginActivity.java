package com.zhangxurui.javase.exception;

import java.util.Scanner;

import com.zhangxurui.javase.exception.HttpConnection.HttpListener;
import com.zhangxurui.javase.exception.HttpConnection.HttpListener1;
public  class LoginActivity /*implements HttpListener*/ {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arg;
		try{
			System.out.println("������:");
			arg = sc.nextInt();
			HttpConnection hp = new HttpConnection();
			//�����ڲ���
			hp.doLogin(arg, new HttpListener(){
	
				@Override
				public void onSuccess() {
					// TODO Auto-generated method stub
					System.out.println("���ӳɹ�");
				}
	
				@Override
				public void onFileNotExist() {
					// TODO Auto-generated method stub
					System.out.println("ҳ�治����");
				}
	
				@Override
				public void onFailure() {
					// TODO Auto-generated method stub
					System.out.println("����ʧ��");
				}
				
			},new HttpListener1(){
				public void onSuccess(){
					System.out.println("���ӳɹ�1");
				}
			});
		}catch(Exception e){
			System.out.println("��������������202,404,��500");
		}
		sc.close();
		
	}

//	@Override
//	public void onSuccess() {
//		// TODO Auto-generated method stub
//		System.out.println("���ӳɹ�");
//	}
//
//	@Override
//	public void onFileNotExist() {
//		// TODO Auto-generated method stub
//		System.out.println("ҳ�治����");
//	}
//
//	@Override
//	public void onFailure() {
//		// TODO Auto-generated method stub
//		System.out.println("����ʧ��");
//	}
	
	
}
