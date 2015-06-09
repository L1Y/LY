package com.guzhijie.javase.review;

public class Calculator {
	public int x;
	public int y;
	public String mark;
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	public void setMark(String mark){
		this.mark = mark;
	}
	
	public String getMark(){
		return mark;
	}
	
	
	public boolean setX(String str){
		if(str != null && str.length() > 0){
		  if(isNumber(str)){
			  int value = Integer.valueOf(str);
			  setX(value);
			  
			  return true;
			  
		  }
		}else{
			System.out.println("x����Ϊ�գ�����������");
			return false;
		}
		return false;
	}
	
	
	public boolean setY(String str){
		if(str != null && str.length() > 0){
		  if(isNumber(str)){
			  int value = Integer.valueOf(str);
			  setY(value);
			  return true;
		  }
		  }else{
			  System.out.println("x����Ϊ�գ�����������");
			  return false;
		}
		return false;
	}
	/**
	 * �ж��Ƿ�Ϊ��Ч�����
	 * @param str Ŀ���ַ���
	 * @return
	 */
	public boolean isValidMark(String str){
		String[] array = {"+", "-", "*" ,"/"};
		for(String item:array){
			if(item.equalsIgnoreCase(str)){
				return true;
			}
		}
		return false;
	}
	
	public int getResult(){
		if("+".equalsIgnoreCase(mark)){
			return x+y;
		}else if("-".equalsIgnoreCase(mark)){
			return x-y;
		}else if("*".equalsIgnoreCase(mark)){
			return x*y;
		}else if("/".equalsIgnoreCase(mark)){
			if(y == 0){
				System.out.println("yΪ����ʱ������Ϊ0");
				return 0;
			}
			return x/y;
		}else{
		    return 0;
		}
	}
	
	
	public static boolean isNumber(String str){
		int len = str.length();
		for(int i = 0; i < len; i++){
			if(!Character.isDigit(str.charAt(i))){
				System.out.println("�����������������");
				return false;
			}
		}
		return true;
	}
	
	public Calculator(int x, int y, String mark){
		this.x = x;
		this.y = y;
		this.mark = mark;
	}
	public  Calculator(){
/*		x= 10;
		y= 5;
		mark = "";*/
	}
	
	public static void main(String[] args){
/*		Calculator calculator = new Calculator();
		calculator.x = 10;
		calculator.y = 5;
		calculator.mark = "/";
		System.out.print(calculator.x + " " + calculator.mark + " " + calculator.y + " = ");
		System.out.println(calculator.getResult());*/
	}
}
