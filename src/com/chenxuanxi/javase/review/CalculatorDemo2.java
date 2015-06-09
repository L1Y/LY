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
public class CalculatorDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Calculator cal = new Calculator();
		
		boolean isSetX = false;//是否给X设置过值
		boolean isSetY = false;//是否给Y设置过值
		
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			if("=".equalsIgnoreCase(str)){
				System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY() + " = " + cal.getResult());
				cal.setX(cal.getResult());
				isSetY = false;
				cal.setMark(null);
			}else if("q".equalsIgnoreCase(str)){
				System.out.println("程序已退出，感谢使用");
				sc.close();
				break;
			}else if("c".equalsIgnoreCase(str)){
				System.out.println("重置成功");
				
				isSetX = false;
				isSetY = false;
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
				
				if(!isSetY && cal.getMark() != null && !cal.isValidMark(str)){
					isSetY = cal.setY(str);
				}
			}
		}
		
	}

}
