package com.zhenshuyu.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
	static int num1;
	static int num2;
	public static void main(String[] args){
		ArithmeticExceptionDemo temp =new ArithmeticExceptionDemo();
		Scanner scanner =new Scanner(System.in);
		try {
			System.out.println("please input one number:");
			num1 = scanner.nextInt();
			System.out.println("please input two number:");
			num2 = scanner.nextInt();
			System.out.println(temp.arithmeticException(num1, num2));
			int [] array={num1,num2};
			System.out.println(array[3]);
		} catch (ArithmeticException e) {
			System.out.println("算数异常！");
		}
		  catch (ArrayIndexOutOfBoundsException e){
			 System.out.println("数组越界异常！"); 
		  }
		finally{
			
		}
	}
	public int arithmeticException(int num1, int num2){
		return num1/num2;
	}

}
