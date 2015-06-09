package com.zhenshuyu.exception;

import java.util.Scanner;

public class NestTry {
	static int num1;
	static int num2;

	public static void main(String[] args) {
		NestTry temp =new NestTry();
		Scanner scanner =new Scanner(System.in);
		
			System.out.println("please input one number:");
			num1 = scanner.nextInt();
			System.out.println("please input two number:");
			num2 = scanner.nextInt();
			int [] array={num1,num2};
			try {		
				System.out.println(temp.arithmeticException(num1, num2));

				try {
					System.out.println(array[3]);
                             
				} catch (Exception e) {
					System.out.println("数组越界异常！");
				} 

			} catch (ArithmeticException e) {
				System.out.println("算数异常！");

			}finally{
				System.out.println("11");
			}		
	}
	public int arithmeticException(int num1, int num2){
		return num1/num2;
	}

}
