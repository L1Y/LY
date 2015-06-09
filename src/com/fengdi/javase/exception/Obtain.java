package com.fengdi.javase.exception;

import java.util.Scanner;

import com.fengdi.javase.exception.ExceptionListener.MyExceptionListener;

public class Obtain {

	public static void main(String[] args) {
		Scanner a = new  Scanner(System.in);
		System.out.println("������ 1~10 ֮�������");
		int b = a.nextInt();
		
		ExceptionListener c = new ExceptionListener();
		c.kill(b, new MyExceptionListener(){

			@Override
			public void MyTry() {
				System.out.println("MyTry()");
				
			}

			@Override
			public void MyCatch() {
				System.out.println("MyCatch()");
				
			}

			@Override
			public void MyFinally() {
				System.out.println("MyFinally()");
				
			}
			
			
			
			
			
		});
	}

}
