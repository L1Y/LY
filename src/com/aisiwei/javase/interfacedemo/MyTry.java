package com.aisiwei.javase.interfacedemo;

import java.util.Scanner;

public class MyTry implements ExceptionListener {
	int num;
	public void dologic( int num )
	{
		this.num = num;
		if (num > 1 && num < 10)
		{
			myTry();
		}
		else {
			myCatch();
		}
		    myFinally();
	}

	
	@Override
	public void myTry() {
		
		System.out.println(num);

	}

	@Override
	public void myCatch() {
		
		{
			System.out.println("ִ�д���");
		}
		
	}

	@Override
	public void myFinally() {
		System.out.println("�������");
	}

}
