package com.jiangmin.javase.calculator;

import java.util.Scanner;
import com.jiangmin.javase.calculator.Calculator;

public class CalculatorDemo {

	public static void main(String[] args){
		/*Calculator calculator = new Calculator(10,0,"-");
		System.out.println(calculator.getResult());*/
		
		/*calculator.judgeInt('x');
		System.out.println(calculator.getX());*/
		
		/*Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		System.out.println(calculator.isNumber(str));*/
		
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		boolean isSetX = false;

		
		while(true){
			String str = scanner.nextLine();
			
			if("=".equals(str)){
				int result = calculator.getResult();
				System.out.println(calculator.getX() + " " + calculator.getMark() + " " + calculator.getY() + " = " + result);
				isSetX = true;
				calculator.setX(result);
				calculator.setY(0);
				calculator.setMark(null);
			}else if("c".equalsIgnoreCase(str)){
				isSetX = false;
				calculator.setX(0);
				calculator.setY(0);
				System.out.println("重置成功");
			}else if("q".equalsIgnoreCase(str)){
				break;
			}else{
				if(!calculator.isValidMark(str)){
					if(calculator.getMark() == null){
						if(calculator.setX(str)){
							isSetX = true;
						}
					}else{
						calculator.setY(str);
					}
				}else{
					calculator.setMark(str);
				}
			}
		}
		
		System.out.println("程序已退出，感谢使用");
		scanner.close();
	}
}
