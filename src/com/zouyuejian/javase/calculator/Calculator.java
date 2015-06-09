package com.zouyuejian.javase.calculator;

public class Calculator {
	private int x;
	private int y;
	private String mark;
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public String getMark(){
		return mark;
	}
	
	public void setMark(String mark){
		this.mark = mark;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	/**
	 * 计算运算结果
	 * @return
	 */
	public int getResult() {
		if ("+".equalsIgnoreCase(mark)) {
			return x + y;
		} else if ("-".equalsIgnoreCase(mark)) {
			return x - y;
		} else if ("*".equalsIgnoreCase(mark)) {
			return x * y;
		} else if ("/".equalsIgnoreCase(mark)) {
			if (y == 0) {
				System.out.println("除数不能为0");
				return 0;
			}
			return x / y;
		} else {
			return 0;
		}
	}
	/**
	 * 判断是否为纯数字
	 * @param str
	 * @return
	 */
	public boolean checkInt(String str){
		char[] array = str.toCharArray();
		int length = str.length();
		for(int i = 0;i < length; i++){
			char item = array[i];
			if(item >= '0' && item <= '9'){
				
			}else{
				System.out.println("输入错误");
				return false;
			}
		}
		return true;
	}
	
	public boolean setX(String str){
		if(checkInt(str)){
			int value = Integer.parseInt(str);
			setX(value);
			return true;
		}
		return   false;
	}
	
	public void setY(String str){
		if(checkInt(str)){
			int value = Integer.valueOf(str);
			setY(value);
		}
	}
	
	public boolean isValidMark(String str){
		String[] array =  {"+","-","*","/"};
		for(String item : array){
			if(item.equals(str)){
				return true;
			}
		}
		return false;
	}

	public Calculator(int x, int y, String mark) {
		this.x = x;
		this.y = y;
		this.mark = mark;
	}
	
	public Calculator(){
		
	}
}
