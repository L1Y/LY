package com.liduan.javase.exception;

public class ThrowDemo {

	public static void main(String[] args) {
		demoProc();
		System.out.println("异常结束");
	}
	
	public static void demoProc(){
		try{
			System.out.println("throw之前");
			//throw new NullPointerException();
			//throw new String();//throw 只能跟Throwable类的子类
			//System.out.println("throw之后");
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

}
