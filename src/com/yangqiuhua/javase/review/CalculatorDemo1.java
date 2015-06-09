package com.yangqiuhua.javase.review;

import java.util.Scanner;

public class CalculatorDemo1 {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		
		boolean isSetX = false; //是否设置了X的值

	   
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			if("=".equalsIgnoreCase(str)){
				System.out.println(cal.getX() + cal.getMark() + cal.getY() + "= " + cal.getResult());
				
				cal.setX(cal.getResult()); //继续输入时将上一个运算结果赋给X
				cal.setMark(null);
				
			}else if("q".equalsIgnoreCase(str)){
				System.out.println("退出程序");
				sc.close();
				
				break;
			}else if("c".equalsIgnoreCase(str)){
				System.out.println("重置成功");
				
				isSetX = false;
				cal.setX(0);
				cal.setY(0);
				cal.setMark(null);
				
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
