package com.wangzexin.javase.exception;

public class MyTry {
	
	public void Proceed(final int arg, MyException1 myException){
		myException.MyTry();
		if(arg<1 || arg>10)
			myException.MyCatch();
		myException.MyFinally();
	}
	
	interface ExceptionListener{
		public void MyTry();
		public void MyCatch();
		public void MyFinally();
	}

}
