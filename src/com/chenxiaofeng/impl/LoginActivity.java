package com.chenxiaofeng.impl;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LoginActivity implements HttpListener {
	private int statusCode;

	public LoginActivity(){
		Scanner input=new Scanner(System.in);
		System.out.println("��������״̬");
		try{
			statusCode=input.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("���Ϸ��Ĵ���״̬��");
			statusCode=0;
		}
		finally{
			input.close();
		}
	}
	public void onFailure() {
		System.out.println("����ʧ��");
	}

	public void onFileNotExist() {
		System.out.println("�����ʵ��ļ�������");
	}

	public void onSuccess() {
		System.out.println("���ӳɹ�");

	}
	
	public int getStatusCode(){
		return statusCode;
	}

}
