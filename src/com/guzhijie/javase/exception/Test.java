package com.guzhijie.javase.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println("�������һ�����֣�");
		a = scanner.nextInt();
		System.out.println("������ڶ������֣�");
		b = scanner.nextInt();
		System.out.println(a + "/" + b + " = " + a / b);
	}catch(Exception e){
		System.out.println(e.toString());
	}finally{
		System.out.println("����û��������");
	}
	}
}
