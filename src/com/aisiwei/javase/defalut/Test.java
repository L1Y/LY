package com.aisiwei.javase.defalut;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		try
		{
			System.out.println("�������һ������");
			num1 = scanner.nextInt();
			System.out.println("������ڶ�������");
			num2 = scanner.nextInt();
			System.out.println(num1+"/"+num2+"="+num1/num2);
		}
		catch(InputMismatchException e)
			{
				e.printStackTrace();
			}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
			{
			System.out.println(e.toString());
			}
		  finally{
			  System.out.println("�������");
			  scanner.close();
		  }
	}

}
