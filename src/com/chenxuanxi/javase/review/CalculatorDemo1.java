/**
 * 
 */
package com.chenxuanxi.javase.review;

import java.util.Scanner;

import com.liduan.javase.calculator.Calculator;

/**
 * @author Daniel Chan
 *
 */
public class CalculatorDemo1 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		cal.setX(str);
		
		sc = new Scanner(System.in);
		str = sc.nextLine();
		if(cal.isValidMark(str)){
			cal.setMark(str);	
		}
		
		sc = new Scanner(System.in);
		str = sc.nextLine();
		cal.setY(str);	
		
		System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY() + " = " + cal.getResult());
	
	}

}
