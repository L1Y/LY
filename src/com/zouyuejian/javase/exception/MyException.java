package com.zouyuejian.javase.exception;

import java.util.Scanner;

public class MyException implements ExceptionListener{

	public void myExcute(int a) {
		if(a>1 && a < 10){
			myTry();
		}else{
			myCatch();
		}
		myFinally();
	}

	@Override
	public void myTry() {
		System.out.println("mytry");
	}

	@Override
	public void myCatch() {
		System.out.println("Ö´ÐÐÒì³£");
	}

	@Override
	public void myFinally() {
		System.out.println("myFinally");
	}
}
