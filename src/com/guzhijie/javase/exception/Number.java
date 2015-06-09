package com.guzhijie.javase.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1~3之间的一个数字:");
		String[] a ={"数学课", "英语课", "语文课" };
		String answer = "";
		try{
		num = scanner.nextInt();
			switch(num){
			case 1 : 
				answer = a[0];
				break;
			case 2 :
				answer = a[1];
				break;
			case 3 :
				answer = a[2];
				break;
			default :
				throw new Exception(){
				/*	answer = "输入错误";*/
				};
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			System.out.println(answer);
			System.out.println("欢迎提出建议");
		}
		

	}

}
