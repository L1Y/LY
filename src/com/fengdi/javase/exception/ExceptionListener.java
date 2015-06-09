package com.fengdi.javase.exception;

public class ExceptionListener  {
	public  void kill(int a ,MyExceptionListener listener){
		if(a >= 1 && a <= 10){
			listener.MyTry();
			listener.MyFinally();
		}else{
			listener.MyTry();
			listener.MyCatch();
			listener.MyFinally();
		}

	
	

	
		
	}

	public interface MyExceptionListener {
		public void MyTry();

		public void MyCatch();

		public void MyFinally();
	}
}