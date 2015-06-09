package com.chenxuanxi.javase.ExceptionListener;

import java.util.Scanner;

public class ExceptionDemo implements ExceptionListener {

	/**
	 * 重写MyTry
	 */
	@Override
	public int MyTry() {
		System.out.println("请输入数字");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt() ;
		return num ;
	}
	/**
	 * 重写MyCatch 
	 */
	@Override
	public String MyCatch() {
		return "执行异常" ;
	}
	/**
	 * 重写MyFinally
	 */
	@Override
	public String MyFinally() {
		return "程序结束";
	}

}
