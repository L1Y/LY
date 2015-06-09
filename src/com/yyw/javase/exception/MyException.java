package com.yyw.javase.exception;

public class MyException  {

	
	public interface ExceptionListener {
		void MyTry();
		void MyCatch();
		void MyFinally();
	}

	public static void proc(ExceptionListener listener){
		listener.MyTry();
	}
}
