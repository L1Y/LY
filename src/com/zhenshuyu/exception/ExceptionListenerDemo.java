package com.zhenshuyu.exception;

import java.util.Scanner;

public class ExceptionListenerDemo implements ExceptionListener {
	public static void main(String[] args){
		ExceptionListenerDemo e =new ExceptionListenerDemo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������������");
		int num=scanner.nextInt();
		e.method(num, new ExceptionListenerDemo());
	}
	public void method(int num ,  ExceptionListenerDemo li){
		if(num>=0&&num<=10){
			li.MyTry();
		}
		else{
			li.MyCatch();
		}
		li.Myfinally();
	}

	
	public void MyTry() {
		System.out.println("������ȷ��");

	}


	public void MyCatch() {
		System.out.println("���뷶Χ����");

	}


	public void Myfinally() {
		System.out.println("��Ҫִ�а���");

	}

}
