package com.guzhijie.javase.review;

import java.util.Scanner;

public class CalculatorDemo {


	public static void main(String[] args){
		Calculator calculator = new Calculator();
/*		calculator.x = 10;
		calculator.y = 5;
		calculator.mark = '*';
		System.out.println(calculator.getResult());*/
		Scanner scanner = new Scanner(System.in);

		String str =scanner.nextLine();
		calculator.setX(str);
		float f = 1.1f;
		
		
		
		
		
		
		/*		String temp;
		boolean i = true;
		do{
		System.out.println("请输入x参数	：");
		temp = scanner.next();
	    if(Calculator.isNumber(temp)){
	    	calculator.x = Integer.parseInt(temp);
	    	 i = false;
	    }
		}while(i);
		
		do{
	    System.out.println("请输入运算符号：");
	    temp = scanner.next();
	    if("+".equalsIgnoreCase(temp) || "-".equalsIgnoreCase(temp) || "*".equalsIgnoreCase(temp) ||"/".equalsIgnoreCase(temp) ){
	        calculator.mark = temp;
	        i =false;
	    }
		}while(i);
		
		
	    do{
			System.out.println("请输入y参数	：");
			temp = scanner.next();
		    if(Calculator.isNumber(temp)){
		    	calculator.y = Integer.parseInt(temp);
		    	 i = false;
		    }
			}while(i);
        System.out.println("输出结果：" + calculator.getResult());
		*/
	}
}
