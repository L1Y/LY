package com.liduan.javase.exception;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		//procA();
		//procB();
		//procC();
		System.out.println("procD:::" + procD());
		System.out.println("���н���");
	}
	
	/*try��catch��finally*/
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
	
	/*	try��ֻ��finallyһ��ʹ����?
	 * 	���ԣ�������������쳣�������ж�
	 * */
	public static void procB(){
		try{
			System.out.println("procB---try");
			throw new RuntimeException();
		}finally{
			System.out.println("procB---finally");
		}
	}
	
	/*	���try�б�return����ִ��finally�еĴ�����������ִ�У�ִ��˳����ʲô
	 * 	��ִ�У����finally�������һ��try���������ʹ�ã���ôfinally���뽫��try�������֮ǰִ��
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
