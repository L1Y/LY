package com.zhangxurui.javase.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int [] c = new int [5];
		
		try{
			System.out.println("������һ����:");
			a = sc.nextInt();
			System.out.println("������ڶ�����:");
			b = sc.nextInt();
			//��������Ϊ0
			System.out.println(a+"/"+b+"="+a/b);
			//����Խ��
			System.out.println("�������飺");
			for(int i=1;i<c.length+2;i++){
				 c[i] = sc.nextInt();
			}		
		}catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("��������Ϊ0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
			System.out.println("����Խ��");
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			System.out.println("exit!");
		}
		sc.close();
	}

}
