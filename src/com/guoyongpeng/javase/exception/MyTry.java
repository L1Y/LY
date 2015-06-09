package com.guoyongpeng.javase.exception;
public class MyTry  {
	public  void dosomething( ExceptionDemo  a,int arg){
		arg = a.MyTry1();
		if(arg < 0||arg > 9){
			a.MyCatch();
		}
		a.MyFinally();
	}
	
}
