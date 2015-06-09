package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * 笔记：Exception
 * 
 *
 */

public class Demo1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * 异常处理
		 * try必须要有catch（可以有多个）
		 * 但不一定有finally
		 */
		try {
			System.out.println("请输入第一个数：");
			num1 = scanner.nextInt();
			System.out.println("请输入第二个数：");
			num2 = scanner.nextInt();
			
			System.out.println(num1+"/"+num2+"="+num1/num2);
			
			/**
			 * 异常捕获
			 * 子类异常类先捕获
			 * 并列子类异常类无顺序
			 */
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
			scanner.close();
			System.out.println("程序结束！");
		}
		

	}

}
