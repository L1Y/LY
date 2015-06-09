package com.zhenshuyu.javase.calculator;

public class CalculatorDemo {
	public static void main(String[] args){
		Calculator cal = new Calculator(10, 0, "/");
		System.out.println("计算结果为：：：" + cal.getResult());
	}
}
