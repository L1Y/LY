package com.chenxuanxi.javase.ExceptionListener;

import java.util.Scanner;

public class ExceptionDemo implements ExceptionListener {

	/**
	 * ��дMyTry
	 */
	@Override
	public int MyTry() {
		System.out.println("����������");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt() ;
		return num ;
	}
	/**
	 * ��дMyCatch 
	 */
	@Override
	public String MyCatch() {
		return "ִ���쳣" ;
	}
	/**
	 * ��дMyFinally
	 */
	@Override
	public String MyFinally() {
		return "�������";
	}

}
