package com.lzm.javase.exception2;


/**
 *
 * Throwable 包含了其线程创建时线程执行堆栈的快照。
 * 即printStactTrace是一个独立打印线程
 *
 */

public class RunExceptionDemo {

	public static void main(String[] args) {
		ArithmeticExceptionDemo ax = new ArithmeticExceptionDemo();
		ArrayIndexOutOfBoundsExceptionDemo abe = new ArrayIndexOutOfBoundsExceptionDemo();
		try {
			//引出ArithmeticException
			try {
				ax.runExceptino();
			} catch (ArithmeticException e) {
				System.out.println("Catch " + e);
				
				//引出ArrayIndexOutOfBoundsException
				try {
					abe.runException();
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Catch " + ex);
				} finally {
					System.out.println("Finish Array");
				}
			} finally {
				System.out.println("Finish Arith");
			}
			/*
			try {
				abe.runException();
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Catch " + ex);
			} finally {
				System.out.println("Finish Array");
			}*/
			
		} catch (Exception e) {
			System.out.println("Other Except");
		} 
		System.out.println("Ended");
	}

}
