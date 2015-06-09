package com.yangqiuhua.javase.review;

public class Calculator {
	private int x;
	private int y;
	private String mark; //��ɶ���ΪString��
	
	/*
	 * �޲η���getResult()��ͨ���û����mark��ֵ���ж϶�x��y����Ӧ�ļ���
	 */
	public int getResult(){
		int result = 0;
		if(mark == "+"){
			result = x + y;  //�˴���ֱ�ӡ�return x + y;�����趨�����result
		}else if(mark == "-"){
			result = x - y;
		}else if(mark == "*"){
			result = x * y;
		}else if(mark == "/"){
			
			if(y == 0){
				System.out.println("yΪ����ʱ������Ϊ0");
				return 0;  //ֱ����������ִ�к�������
			}
			
			result = x / y;
			
		}
		return result;
	}
	
	/**
	 * �ж�������ַ����Ƿ�Ϊ������
	 * @param str
	 */
	public boolean isInteger(String str){
		char[] arr = str.toCharArray();
		int len = arr.length;
		for(int i = 0; i < len; i++){
			if(arr[i] >= '0' | arr[i] <= '9'){
				
			}else{
				System.out.println("������������������");
				
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
			System.out.println("Y����Ϊ�գ�����������");

			return false;
		}
		return false;
	}
	
	/**
	 * �ж�������ַ����Ƿ�Ϊ��Ч�������
	 * @param str Ŀ���ַ���
	 * @return
	 */
	public boolean isValidMark(String str){
		String[] arr = {"+", "-","*","/"};
		for(String item : arr){
			if(item.equalsIgnoreCase(str)){
				return true;   //��ǿforѭ��
			}
		}
		return false;
	}
	
	/*
	 * �вεĹ��캯����ʵ�ַ�װ��
	 */
	public Calculator(int x, int y, String mark){
		this.x = x;  //this�ؼ��ִ���ʵ��������ǰ��Ϊ���е�����x������Ϊ���캯�����β�x��
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
		
		System.out.println( "������Ϊ��" + cal.getResult() );
	}

}
