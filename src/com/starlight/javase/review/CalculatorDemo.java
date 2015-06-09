package com.starlight.javase.review;

import java.util.Scanner;

import com.starlight.javase.review.Caculator;

/**
 * @version Alpha
 * @author Flying Starlight
 * 基本实现运算功能，并没有加入循环和退出判定
 * 在考虑要不要把demo的这一串封装
 *
 */
public class CalculatorDemo {

	static String str; // this represents the input from keyboard
	static int i = 0;
	static char ch = '0';
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Caculator cal = new Caculator(0,0,'0');
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		str = sc.nextLine();
		cal.setX(cal.convertToInt(str));
		System.out.println("请输入所要进行运算的运算符");
		str = sc.nextLine();
		str.replace(" ", ""); //去掉空格
		ch = str.charAt(0);
		cal.isValidOperator(ch);
		System.out.println("请输入第二个数");
		str = sc.nextLine();
		cal.setY(cal.convertToInt(str));
		if(cal.getFlag() == 3){
			cal.calting(cal.getOperator(), cal.getX(), cal.getY());
			if( cal.getY() == 0 && cal.getOperator() == '/'){	
			}else{
				System.out.println(cal.getResult());
			}
		}

		

	}


}


