package com.guzhijie.javase.exception;

import java.util.Scanner;

public class ExcepListenerDemo implements ExceptionListener{

	@Override
	public void MyTry() {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if(temp < 1 || temp > 10){
			MyCatch();
		}else{
			System.out.println("输入的数字为：" + temp);
		}
		
	}

	@Override
	public void MyCatch() {
		System.out.println("执行异常");
	}

	@Override
	public void MyFinally() {
		System.out.println("程序结束");
		
	}

}
