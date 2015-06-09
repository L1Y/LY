package com.wangzexin.javase.exception;

public class ArithmeticExceptionDemo {

	public static void main(String[] args){
		
		int x = 3;
		int y = 0;
		int[] array = new int[10];
		try{
			for(int i=0;i<11;i++){
				array[i] = i;
			}
			System.out.println(x/y);
			
		} catch(ArithmeticException e){
			System.out.println("Math Error");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Error");
		}finally{
			System.out.println("over");
		}
	}
}