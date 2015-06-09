package com.guzhijie.javase.exception;

public class ExceptionDemo {
	public static void main(String[] args){
		int a = 1;
		int b = 0;
		int c[] = new int[10];
		try{
			/*System.out.println(a / b);*/

			System.out.println(c[11]);

		}catch(ArithmeticException e){
			e.printStackTrace();
			//System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			//System.out.println(e.toString());
		}finally{
			System.out.println("율율율율");
		}
	}
}
