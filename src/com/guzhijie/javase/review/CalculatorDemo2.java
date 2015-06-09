package com.guzhijie.javase.review;

import java.util.Scanner;


public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		boolean isSetX = false;
		boolean isSetY = false;
		
		
		while(true){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		if("q".equalsIgnoreCase(str)){
			System.out.println("程序已退出，感谢使用");
			scanner.close();
			break;
			
		}else if("=".equalsIgnoreCase(str)){
			System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY() + " = " + cal.getResult());
		    cal.setX(cal.getResult());
		    isSetY = false;
		    cal.setMark(null);
		}else if("c".equalsIgnoreCase(str)){
			System.out.println("重置成功");
			
			isSetX = false;
			isSetY = false;
			cal.setX(0);
			cal.setY(0);
			cal.setMark(null);
		}else{
			if(!cal.isValidMark(str) && !isSetX){
				isSetX = cal.setX(str);
			}else if(cal.isValidMark(str)){
				cal.setMark(str);
				isSetX = true;
			}else if(!cal.isValidMark(str) && !isSetY){
				isSetY = cal.setY(str);
			}
		}
		}

	}

}
