package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 *
 *	throws的作用：用于列举一个方法可能引发的异常
 *	
 *	throw与throws的区别
 *	throw:只能写在方法体内，用来引发明确的异常。、
 *	throws:只能用于列举一个方法可能引发的异常
 *
 *	throws与try/catch的区别
 *	throws:只是列举了一个方法可能引发的异常，但不能做任何处理
 *	try/catch:捕获try中引发的异常，并能够在catch中修复异常发生时的错误
 *
 *	在开发中推荐大家都用try/catch
 *	
 */
public class ThrowsDemo {

	public static void main(String[] args) throws IllegalAccessException {
		throwOne();
		
		throwTwo();
		throwThree();
		System.out.println("main");
	}
	
	static void throwOne() throws IllegalAccessException {
		System.out.println("throwOne");
	}
	
	static void throwTwo(){
		try{
			throw new IllegalAccessException("throwTwo");
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	
	static void throwThree(){
		try{
			throw new IllegalAccessException("throwThree");
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}

}
