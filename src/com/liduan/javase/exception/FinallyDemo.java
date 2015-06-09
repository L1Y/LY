package com.liduan.javase.exception;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		//procA();
		//procB();
		//procC();
		System.out.println("procD:::" + procD());
		System.out.println("运行结束");
	}
	
	/*try、catch、finally*/
	public static void procA(){
		Scanner sc = null;
		try{
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(1/num);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sc.close();
		}
	}
	
	/*	try能只和finally一起使用吗?
	 * 	可以，但是如果出现异常，程序将中断
	 * */
	public static void procB(){
		try{
			System.out.println("procB---try");
			throw new RuntimeException();
		}finally{
			System.out.println("procB---finally");
		}
	}
	
	/*	如果try中被return还会执行finally中的代码块吗？如果会执行，执行顺序是什么
	 * 	会执行，如果finally代码块与一个try代码块联合使用，那么finally代码将在try代码结束之前执行
	 * */
	public static void procC(){
		Scanner sc = null;
		try{
			System.out.println("procC---try");
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num != 0){
				return;
			}else{
				System.out.println(1/0);
			}
		}finally{
			System.out.println("procC---finally");
		}
	}
	
	public static int procD(){
		Scanner sc = null;
		try{
			System.out.println("procD---try");
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num != 0){
				return num;
			}else{
				System.out.println(1/0);
				return 0;
			}
		}finally{
			System.out.println("procC---finally");
//			return 0;
		}
		
	}

}
