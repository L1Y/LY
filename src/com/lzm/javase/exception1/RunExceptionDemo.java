package com.lzm.javase.exception1;

public class RunExceptionDemo {

	public static void main(String[] args) {
		ArithmeticExceptionDemo ax = new ArithmeticExceptionDemo();
		ArrayIndexOutOfBoundsExceptionDemo abe = new ArrayIndexOutOfBoundsExceptionDemo();
		try {
			//����ArithmeticException
			try {
				ax.runExceptino();
			} catch (ArithmeticException e) {
				System.out.println("Catch " + e);
				
				//����ArrayIndexOutOfBoundsException
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
