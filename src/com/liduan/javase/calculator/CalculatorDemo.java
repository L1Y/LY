package com.liduan.javase.calculator;

public class CalculatorDemo {
	public static void main(String[] args){
		Calculator cal = new Calculator(10, 0, "/");
		System.out.println("������Ϊ������" + cal.getResult());
	}
}
