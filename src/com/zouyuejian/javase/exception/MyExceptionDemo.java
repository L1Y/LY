package com.zouyuejian.javase.exception;

import java.util.Scanner;

public class MyExceptionDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			MyException mye = new MyException();
			mye.myExcute(a);
		}catch(Exception e){
			System.out.println(" ‰»Î¥ÌŒÛ");
		}finally{
			sc.close();
		}
	}
}
