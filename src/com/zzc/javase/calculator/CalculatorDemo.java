package com.zzc.javase.calculator;

public class CalculatorDemo {
	public static void main(String []args){
		//����Calculator��ʵ��
		Calculator cal = new Calculator(3,7,"*");
		System.out.println("������Ϊ��"+cal.getResult());
	}
}
