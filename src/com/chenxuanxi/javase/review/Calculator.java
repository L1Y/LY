/**
 * 
 */
package com.chenxuanxi.javase.review;


/**
 * @author Daniel Chan
 *������
 */
public class Calculator {

	/**
	 * ����ʵ������
	 * @param args
	 */
	private int x ; 
	private int y ;
	private String mark;
	
	/**
	 *�ж�mark�Ƿ����������� 
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
	 * ����������Ĺ��췽��
	 * @param x
	 * @param y
	 * @param mark
	 */
	public  Calculator(int x ,int y ,String mark){
		this.x =x;
		this.y=y;
		this.mark=mark;
	}
	
	/**
	 * �ж�������ַ����Ƿ�Ϊ������
	 * @param str
	 * @return
	 */
	public boolean chNumbers(String str){
		char [] array = str.toCharArray();
		int len = array.length;
		for(int i = 0 ; i<=len ; i++){
			int temp = array[i];
			if(temp>='0' && temp<='9'){
				
			}else{
				System.out.println("������������������");
				return false ;
			}
		}
		return true ;
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
			if(chNumbers(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}else{
				System.out.println("������������������");
				
				return false;
			}
		}else{
			System.out.println("X����Ϊ�գ�����������");
			
			return false;
		}
	}

	public boolean setY(String str) {
		if(str != null && str.length() > 0){
			if(chNumbers(str)){
				int value = Integer.valueOf(str);
				setY(value);
				
				return true;
			}else{
				System.out.println("������������������");

				return false;
			}
		}else{
			System.out.println("Y����Ϊ�գ�����������");

			return false;
		}
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
	
//	public Calculator(){
//		x=10;
//		y=5;
//		mark='+';
//	}
//	
//	public static void main(String[] args) {
//		Calculator num = new Calculator(10,5,'+');
//		System.out.println(num.getResult());
//			
//		}

	}













