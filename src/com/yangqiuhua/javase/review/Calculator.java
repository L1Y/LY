package com.yangqiuhua.javase.review;

public class Calculator {
	private int x;
	private int y;
	private String mark; //亦可定义为String型
	
	/*
	 * 无参方法getResult()。通过该会根据mark的值来判断对x，y做相应的计算
	 */
	public int getResult(){
		int result = 0;
		if(mark == "+"){
			result = x + y;  //此处可直接“return x + y;”无需定义变量result
		}else if(mark == "-"){
			result = x - y;
		}else if(mark == "*"){
			result = x * y;
		}else if(mark == "/"){
			
			if(y == 0){
				System.out.println("y为除数时，不能为0");
				return 0;  //直接跳出，不执行后续部分
			}
			
			result = x / y;
			
		}
		return result;
	}
	
	/**
	 * 判断输入的字符串是否为纯数字
	 * @param str
	 */
	public boolean isInteger(String str){
		char[] arr = str.toCharArray();
		int len = arr.length;
		for(int i = 0; i < len; i++){
			if(arr[i] >= '0' | arr[i] <= '9'){
				
			}else{
				System.out.println("输入有误，请重新输入");
				
				return false;
			}
		}
		
		return true;
	}
	
	public boolean setX(String str) {
		if(str != null && str.length() > 0){
			if(isInteger(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}
		}
		return false;
	}

	public boolean setY(String str) {
		if(str != null && str.length() > 0){
			if(isInteger(str)){
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
	 * 判断输入的字符串是否为有效的运算符
	 * @param str 目标字符串
	 * @return
	 */
	public boolean isValidMark(String str){
		String[] arr = {"+", "-","*","/"};
		for(String item : arr){
			if(item.equalsIgnoreCase(str)){
				return true;   //增强for循环
			}
		}
		return false;
	}
	
	/*
	 * 有参的构造函数（实现封装）
	 */
	public Calculator(int x, int y, String mark){
		this.x = x;  //this关键字代表实例变量（前者为类中的属性x，后者为构造函数的形参x）
		this.y = y;
		this.mark = mark;
	}
	
	public Calculator(){
		
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public String getMark(){
		return mark;
	}
	
	public void setMark(String mark){
		this.mark = mark;
	}
	
	

	
	public static void main(String[] args){
		Calculator cal = new Calculator(10,5,"-");
		
		System.out.println( "计算结果为：" + cal.getResult() );
	}

}
