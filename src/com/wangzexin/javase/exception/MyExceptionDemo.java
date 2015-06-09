package com.wangzexin.javase.exception;

import java.util.Scanner;

public class MyExceptionDemo {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		MyException myException = new MyException(num);
		myException.Proceed();
		System.out.println("**************************");
		num = scanner.nextInt();
		MyTry myTry = new MyTry();
		myTry.Proceed(num, new MyException1());
		scanner.close();
	}
}
