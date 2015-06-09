package com.guzhijie.javase.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println("请输入第一个数字：");
		a = scanner.nextInt();
		System.out.println("请输入第二个数字：");
		b = scanner.nextInt();
		System.out.println(a + "/" + b + " = " + a / b);
	}catch(Exception e){
		System.out.println(e.toString());
	}finally{
		System.out.println("完了没东西看了");
	}
	}
}
