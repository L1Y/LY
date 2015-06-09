package com.jiangmin.javase.calculator;

import java.util.Scanner;

/**
 * 这是一个关于计算器操作的类
 * @author Administrator
 * @version V1.0.0
 */
public class Calculator {
	private int x;
	private int y;
	private String mark;

	/**
	 * 生成一个关于计算器的对象
	 * @param x 第一个计算值
	 * @param y 第二个计算值
	 * @param mark 计算符号
	 */
	public Calculator(int x, int y, String mark) {
		this.x = x;
		this.y = y;
		this.mark = mark;
	}
	
	/**
	 * 生成一个关于计算器的对象
	 */
	public Calculator(){
		
	}

	/**
	 * 打印出结果
	 * 
	 * @return 结果的对应值
	 */
	public int getResult() {
		if ("+".equalsIgnoreCase(mark)) {
			return x + y;
		} else if ("-".equalsIgnoreCase(mark)) {
			return x - y;
		} else if ("*".equalsIgnoreCase(mark)) {
			return x * y;
		} else if ("/".equalsIgnoreCase(mark)) {
			if (0 == y) {
				System.out.println("除数不能为0！");

				return 0;
			} else {
				return x / y;
			}
		} else {
			return 0;
		}
	}

	/**
	 * 输入一个字符串，给变量x或者变量y赋值；
	 * 
	 * @param input
	 *            输入x或者y字符，分别对应x和y变量
	 */
	public void judgeInt(char input) {
		Scanner scanner = new Scanner(System.in);

		String str;
		char[] ch;
		int length;

		out: while (true) {
			str = scanner.next();
			ch = str.toCharArray();
			length = ch.length;

			in: for (int i = 0; i < length; i++) {
				if (null == str) {
					System.out.println("X或Y不能为空，请重新输入");
					break in;
				} else if (!Character.isDigit(ch[i])) {
					System.out.println("输入有误，请重新输入");
					break in;
				}
				if (length - 1 == i) {
					break out;
				}
			}
		}

		if ('x' == input) {
			x = Integer.valueOf(str);
		} else if ('y' == input) {
			y = Integer.valueOf(str);
		} else {

		}

		scanner.close();
	}

	/**
	 * 判断输入的字符串是否为纯数字
	 * 
	 * @param str
	 *            将要判断的字符串
	 * @return 真或假
	 */
	public boolean isNumber(String str) {
		char[] array = str.toCharArray();
		int length = array.length;

		for (int i = 0; i < length; i++) {
			if (array[i] >= '0' && array[i] <= '9') {

			} else {
				System.out.println("输入有误，请重新输入");
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断是否为有效运算符
	 * 
	 * @param str
	 *            目标字符串
	 * @return
	 */
	public boolean isValidMark(String str) {
		String[] array = { "+", "-", "*", "/" };

		for (String item : array) {
			if (item.equals(str)) {
				return true;
			}
		}
		return false;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public boolean setX(String str){
		if(null != str && str.length() > 0){
			if(isNumber(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}			
		}

		return false;			
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean setY(String str){
		if(null != str && str.length() > 0){
			if(isNumber(str)){
				int value = Integer.valueOf(str);
				setY(value);
				
				return true;
			}		
		}

		return false;			
	}

	public int getY() {
		return y;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

}
