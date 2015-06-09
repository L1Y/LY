package com.yyw.javase.exception;

import java.util.Scanner;

import com.yyw.javase.exception.MyException.ExceptionListener;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyException pc = new MyException();
		pc.proc(new ExceptionListener() {
			
			public void MyTry() {
				int num;
				Scanner in = new Scanner(System.in);
				System.out.println("输入1-10执行Mytry");
				System.out.println("否则执行MyCatch");
				num = in.nextInt();
				if(num < 1 || num > 10){
					//System.out.println("这里");
					MyCatch();
				}
				MyFinally();
			}
			
			public void MyFinally() {
				System.out.println("Finally");
			}
			
			public void MyCatch() {
				System.out.println("异常处理");
			}
		});
	}

	
}
