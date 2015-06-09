package com.aisiwei.javase.interfacedemo;

import java.util.Scanner;

public class MyTryDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		MyTry mt = new MyTry();
		mt. dologic(num);
		sc.close();
	}
}
