package com.zzc.javase.calculator;

public class CalculatorDemo {
	public static void main(String []args){
		//构造Calculator类实例
		Calculator cal = new Calculator(3,7,"*");
		System.out.println("计算结果为："+cal.getResult());
	}
}
