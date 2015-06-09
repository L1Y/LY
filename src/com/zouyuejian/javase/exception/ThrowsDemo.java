package com.zouyuejian.javase.exception;
/**
 * 
 * @author zyj
 *
 *  Throws的作用：用于列举一个方法可能引发的异常
 *  一个馒头引发的血案
 *  throw与throws的区别
 *  throw：只能写在方法体内，用来引出明确的异常。
 *  throws：只能用于列举一个方法可能引发的异常
 *
 *  throws与try/catch的区别
 *  throws：只是列举了一个方法可能引发的异常，但不能做任何处理
 *  try/catch：捕获try中引发的异常，并能够在catch中修复异常发生时的错误
 *
 *  在开发中推荐大家都用try/catch
 * 
 */
public class ThrowsDemo {
	public static void main(String[] args) {
		int a = throw1();
		System.out.println(a);
 	}
	
	public static int throw1(){
		try{
			System.out.println("阿西吧");
			System.out.println("傻逼");
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println(2);
		}
		return 0;
	}
	
}
