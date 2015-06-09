package com.wangzexin.javase.exception;

import com.wangzexin.javase.exception.MyTry.ExceptionListener;

public class MyException implements ExceptionListener{

	private int x = 0;
	
	public MyException(int x){
		this.x = x;
	}
	
	public void Proceed(){
		MyTry();
	}
	
	@Override
	public void MyTry() {
		// TODO Auto-generated method stub
		System.out.println("MyTry");
		if(x>1 && x<10)
			MyFinally();
		else 
			MyCatch();
	}

	@Override
	public void MyCatch() {
		// TODO Auto-generated method stub
		System.out.println("MyCatch");
		if(x>10)
			System.out.println("x>10");
		else
			System.out.println("x<1");
		MyFinally();
	}

	@Override
	public void MyFinally() {
		// TODO Auto-generated method stub
		System.out.println("MyFinally");
		System.out.println("program over");
	}
	
}
