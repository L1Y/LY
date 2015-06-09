package com.guoyongpeng.javase.exception;

import java.util.Scanner;

public class ExceptionDemo implements ExceptionListener{

	public static void main(String[] args) {
		int b = 0;
		ExceptionDemo ex = new ExceptionDemo();
		MyTry mytry = new MyTry();
		mytry.dosomething(ex,b);

	}

	@Override
	public int MyTry1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}

	@Override
	public void MyCatch() {
		System.out.println(" ‰»Î¥ÌŒÛ");
	}

	@Override
	public void MyFinally() {
		System.out.println("Ω· ¯");
	}

}
