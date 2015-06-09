package com.chenxuanxi.javase.ExcepTion;

/**
 * @author Administrator
 *
 */
public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int [] a = {1,2,3};
			System.out.println(a[3]/0);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
