package com.guzhijie.javase.exception;

public class ThrowDemo {
	
	public static void demoProc(){
	try{
		throw new ArithmeticException();
	}catch(ArithmeticException e){
		e.printStackTrace();
	}catch(NullPointerException e){
		e.printStackTrace();
	}
	}
	
	static void throwOne() throws IllegalAccessException{
		System.out.println("throwOne");
		throw new IllegalAccessException();

	}
	
	static void throwTwo(){
		try{
			throw new IllegalAccessException();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static int throwThree(){
		try{
			return 0;
		}finally{
			System.out.println("out");
		}
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		//demoProc();
		//throwOne();
		//throwTwo();
		System.out.println(throwThree());
	}

}
