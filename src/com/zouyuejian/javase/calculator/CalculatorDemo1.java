package com.zouyuejian.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo1 {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		boolean isSetX = false;
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			//boolean isSetY = false;
			if(str.equalsIgnoreCase("=")){
				System.out.println(cal.getX() + cal.getMark() + cal.getY() +" = "+cal.getResult());
				cal.setX(cal.getResult());
				cal.setMark(null);
				cal.setY(0);
				isSetX = true;
			}else if(str.equalsIgnoreCase("q")){
				System.out.println("程序已退出");
				sc.close();
				break;
			}else if(str.equalsIgnoreCase("c")){
				System.out.println("重置成功");
				cal.setX(0);
				cal.setY(0);
				cal.setMark(null);
				isSetX = false;
			}else{
				if(!isSetX && !cal.isValidMark(str)){
					isSetX = cal.setX(str);
				}
				if(cal.isValidMark(str)){
					cal.setMark(str);
				}
				if(cal.getMark() != null && !cal.isValidMark(str)){
					cal.setY(str);
				}
					
			}
		}
	}
}
