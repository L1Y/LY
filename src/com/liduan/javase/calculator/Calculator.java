package com.liduan.javase.calculator;

public class Calculator {
	private int x;//第一个参数
	private int y;//第二个参数
	private String mark;//运算符
	
	/**
	 * 获取计算结果
	 * @return
	 */
	public int getResult(){
		if("+".equalsIgnoreCase(mark)){
			return x + y;
		}else if("-".equalsIgnoreCase(mark)){
			return x - y;
		}else if("*".equalsIgnoreCase(mark)){
			return x * y;
		}else if("/".equalsIgnoreCase(mark)){
			if(y == 0){
				System.out.println("当y为除数时，y不能为0");

				return 0;
			}

			return x / y;
		}else{
			return 0;
		}
	}
	
	/**
	 * 判断一个字符串是否是纯数字
	 * @param str	目标字符串
	 * @return
	 */
	public boolean isNumberic(String str){
		char[] array = str.toCharArray();
		int len = array.length;
		for(int i = 0; i < len; i++){
			char item = array[i];
			if(item >= '0' && item <= '9'){
				
			}else{
				System.out.println("输入有误，请重新输入");
				
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 带参数的构造方法
	 * @param x	形参X
	 * @param y	形参Y
	 * @param mark
	 */
	public Calculator(int x, int y, String mark){
		this.x = x;//this关键字表示实例变量
		this.y = y;
		this.mark = mark;
	}
	
	public Calculator(){
//		x = 10;
//		y = 5;
//		mark = "+";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

 
	public boolean setX(String str) {
		if(str != null && str.length() > 0){
			if(isNumberic(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}
		}else{
			System.out.println("X不能为空，请重新输入");
			
			return false;
		}
		
		return false;
	}

	public boolean setY(String str) {
		if(str != null && str.length() > 0){
			if(isNumberic(str)){
				int value = Integer.valueOf(str);
				setY(value);
				
				return true;
			}
		}else{
			System.out.println("Y不能为空，请重新输入");

			return false;
		}
		
		return false;
	}
	
	/**
	 * 判断是否是有效运算符
	 * @param str	目标字符串
	 * @return
	 */
	public boolean isValidMark(String str){
		String[] array = {"+", "-", "*", "/"};
		
		for(String item : array){
			if(item.equalsIgnoreCase(str)){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 判断是否是有效运算符
	 * @param str	目标字符串
	 * @return
	 */
	public boolean isValidMark(char str){
		char[] array = {'+', '-', '*', '/'};
		
		for(char item : array){
			if(item == str){
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}
