package com.liduan.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo3 {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		
		boolean isSetX = false;//是否设置过X的值
		
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			if("=".equalsIgnoreCase(str)){
				System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY() + " = " + cal.getResult());
				
				cal.setX(cal.getResult());
				cal.setMark(null);
			}else if("q".equalsIgnoreCase(str)){
				System.out.println("程序已退出，感谢使用");
				sc.close();
				
				break;
			}else if("c".equalsIgnoreCase(str)){
				System.out.println("重置成功");
				
				cal.setMark(null);
				cal.setX(0);
				cal.setY(0);
				isSetX = false;
			}else{
				if(!isSetX && !cal.isValidMark(str)){
					isSetX = cal.setX(str);
				}
				
				if(cal.isValidMark(str)){
					cal.setMark(str);
					isSetX = true;
				}
				
				if(cal.getMark() != null && !cal.isValidMark(str)){
					cal.setY(str);
				}
			}
		}
	}
}
