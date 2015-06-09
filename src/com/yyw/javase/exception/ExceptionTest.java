package com.yyw.javase.exception;

import java.util.Scanner;

import com.yyw.javase.exception.MyException.ExceptionListener;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyException pc = new MyException();
		pc.proc(new ExceptionListener() {
			
			public void MyTry() {
				int num;
				Scanner in = new Scanner(System.in);
				System.out.println("����1-10ִ��Mytry");
				System.out.println("����ִ��MyCatch");
				num = in.nextInt();
				if(num < 1 || num > 10){
					//System.out.println("����");
					MyCatch();
				}
				MyFinally();
			}
			
			public void MyFinally() {
				System.out.println("Finally");
			}
			
			public void MyCatch() {
				System.out.println("�쳣����");
			}
		});
	}

	
}
