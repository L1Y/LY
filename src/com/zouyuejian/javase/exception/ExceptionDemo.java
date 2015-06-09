package com.zouyuejian.javase.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
	 mythrow();
	 System.out.println(2);
	}
	public static void mythrow(){
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}
