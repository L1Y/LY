package com.liduan.javase.calculator;

public class Calculator {
	private int x;//��һ������
	private int y;//�ڶ�������
	private String mark;//�����
	
	/**
	 * ��ȡ������
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
				System.out.println("��yΪ����ʱ��y����Ϊ0");

				return 0;
			}

			return x / y;
		}else{
			return 0;
		}
	}
	
	/**
	 * �ж�һ���ַ����Ƿ��Ǵ�����
	 * @param str	Ŀ���ַ���
	 * @return
	 */
	public boolean isNumberic(String str){
		char[] array = str.toCharArray();
		int len = array.length;
		for(int i = 0; i < len; i++){
			char item = array[i];
			if(item >= '0' && item <= '9'){
				
			}else{
				System.out.println("������������������");
				
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * �������Ĺ��췽��
	 * @param x	�β�X
	 * @param y	�β�Y
	 * @param mark
	 */
	public Calculator(int x, int y, String mark){
		this.x = x;//this�ؼ��ֱ�ʾʵ������
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
			System.out.println("X����Ϊ�գ�����������");
			
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
			System.out.println("Y����Ϊ�գ�����������");

			return false;
		}
		
		return false;
	}
	
	/**
	 * �ж��Ƿ�����Ч�����
	 * @param str	Ŀ���ַ���
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
	 * �ж��Ƿ�����Ч�����
	 * @param str	Ŀ���ַ���
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
