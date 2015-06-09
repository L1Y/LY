package com.zzc.javase.exception;

import java.util.Scanner;


public class MyExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		MyException.doTry( num,new MyException());
	}

}
