package com.zhongguohua.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("请输入：");
			String stringIn1 = sc.nextLine();
			if(isQ(stringIn1)){
				System.out.print("程序已退出，感谢使用");
				flag = false;
			}
			else if(isC(stringIn1)){
				System.out.print("");
			}
			String stringIn2 = sc.nextLine();
			String stringIn3 = sc.nextLine();
			
			Calculator calculator = new Calculator();
			calculator.getResult();
		}
	}
	
	public static boolean isQ(String stringIn){
		if(stringIn.equalsIgnoreCase("q")){
			return true;
		}
		return false;
	}
	
	public static boolean isC(String stringIn){
		if(stringIn.equalsIgnoreCase("c")){
			return true;
		}
		return false;
	}
}
