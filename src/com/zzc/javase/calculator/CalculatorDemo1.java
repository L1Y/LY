package com.zzc.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo1 {
	public static void main(String args[]){
		Calculator cal = new Calculator();
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		cal.setX(str);
		
		in = new Scanner(System.in);
		str = in.nextLine();
		if(cal.isValidMark(str)){
			cal.setMark(str);
		}
		
		in = new Scanner(System.in);
		str = in.nextLine();
		cal.setY(str);
		
		System.out.println(cal.getX() + cal.getMark() + cal.getY() + "=" + cal.getResult() );
	}
	
	
}
