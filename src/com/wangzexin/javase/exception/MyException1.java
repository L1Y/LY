package com.wangzexin.javase.exception;

import com.wangzexin.javase.exception.MyTry.ExceptionListener;

public class MyException1 implements ExceptionListener{
	
	@Override
	public void MyTry() {
		// TODO Auto-generated method stub
		System.out.println("MyTry");
	}

	@Override
	public void MyCatch() {
		// TODO Auto-generated method stub
		System.out.println("MyCatch");
	}

	@Override
	public void MyFinally() {
		// TODO Auto-generated method stub
		System.out.println("MyFinally");
	}

}
