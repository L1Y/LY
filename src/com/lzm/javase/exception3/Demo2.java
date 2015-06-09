package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		/**
		 * 变量生成周期
		 * 从左大括号到右大括号
		 */
		try {
			int num1;
			int num2;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入第一个数：");
			num1 = scanner.nextInt();
			System.out.println("请输入第二个数：");
			num2 = scanner.nextInt();
			
			System.out.println(num1+"/"+num2+"="+num1/num2);
			
			/**
			 * scanner变量在finally中已经失效
			 */
			scanner.close();
			
		} catch (ArithmeticException e) {
			System.out.println("输入不匹配");
		} catch (InputMismatchException e) {
			System.out.println("除数为零");
		} catch (Exception e) {
			System.out.println("程序异常！");
		} finally {
			
			/**
			 * 释放资源
			 */
			//scanner.close();
			System.out.println("程序结束！");
		}
		

	}

}
