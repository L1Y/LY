package com.zhangxurui.javase.exception;

public class NestTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try{
				System.out.println(1/0);
			}catch(ArithmeticException e){
				System.out.println("��������Ϊ0");
				System.out.println(e.toString());
			}
			int [] a = new int [1];
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ��");
			System.out.println(e.toString());
		}
	}


}
