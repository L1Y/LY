package com.guzhijie.javase.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������1~3֮���һ������:");
		String[] a ={"��ѧ��", "Ӣ���", "���Ŀ�" };
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
				/*	answer = "�������";*/
				};
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			System.out.println(answer);
			System.out.println("��ӭ�������");
		}
		

	}

}
