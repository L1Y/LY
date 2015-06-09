package com.chenxuanxi.javase.review;

public class CalculatorDemo {
	
	public static void main(String args[]){
		/**
		 * 调用实例的方法
		 */
		Calculator num = new Calculator(10,0,"/");
		System.out.println(num.getResult());
	}

}
