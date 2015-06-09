package com.zhongguohua.javase.calculator;

import java.util.Scanner;

public class runCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true){
			String stringIn1 = s.next();
			String stringIn2= s.next();
			String stringIn3 = s.next();
			Calculator calculator = new Calculator();
			//System.out.println(calculator.calculator(stringIn1, stringIn2, stringIn3));
		}
	}
}
