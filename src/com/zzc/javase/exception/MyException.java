package com.zzc.javase.exception;



public class MyException implements ExceptionListenner{
	public static void doTry(int num, ExceptionListenner listenner){
		if(num >= 1 && num <= 10){
			listenner.MyTty();
		}else{
			listenner.MyCatch();
		}
		listenner.MyFinally();
	}
	
	@Override
	public void MyTty() {
		// TODO Auto-generated method stub
		System.out.println("MyTry");
	}

	@Override
	public void MyCatch() {
		// TODO Auto-generated method stub
		System.out.println("MyCatchÖ´ĞĞÒì³£");
	}

	@Override
	public void MyFinally() {
		// TODO Auto-generated method stub
		System.out.println("MyFinally");
	}

}
