package com.lzm.javase.exception4;

import java.util.Scanner;

public class RunMyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		//test1
		new ExceptionInterface(x, new ExceptionInterface());
		
		
		x = scanner.nextInt();
		//test2
		new ExceptionInterface2(x, new ExceptionListener() {
			
			@Override
			public void myTry() {
				System.out.println("try_2");
			}
			
			@Override
			public void myFinally() {
				System.out.println("finally_2");
			}
			
			@Override
			public void myCatch() {
				System.out.println("catch_2");
			}
		});
		
		scanner.close();
	}

}
