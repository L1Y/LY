package com.fengdi.javase.exception;

import java.util.Scanner;



public class ArithmeticException {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		int a = 4 ;
		int b = 0 ;
		try{
//		System.out.println(a/b);
		System.out.println(array[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("����Խ��");
			}
//		catch(Exception e){
//			e.printStackTrace();
//			System.out.println("����������Ϊ0");
//		}
			
		
	

}
}