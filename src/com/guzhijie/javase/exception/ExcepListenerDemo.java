package com.guzhijie.javase.exception;

import java.util.Scanner;

public class ExcepListenerDemo implements ExceptionListener{

	@Override
	public void MyTry() {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if(temp < 1 || temp > 10){
			MyCatch();
		}else{
			System.out.println("���������Ϊ��" + temp);
		}
		
	}

	@Override
	public void MyCatch() {
		System.out.println("ִ���쳣");
	}

	@Override
	public void MyFinally() {
		System.out.println("�������");
		
	}

}
