package com.zzc.javase.calculator;

public class Calculator{
	private int x;//��һ������
	private int y;//�ڶ�������
	String mark;//�����
	
	/**
	 * ���췽��
	 * @param x
	 * @param y
	 * @param mark
	 */
	public Calculator(int x, int y, String mark){
		this.x = x;
		this.y = y;
		this.mark = mark;
	}
	
	public Calculator() {
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * ȡ��������
	 * @return
	 */
	int getResult(){
		if("+".equalsIgnoreCase(mark)){
			return x + y;
		}else if("-".equalsIgnoreCase(mark)){
			return x - y;
		}else if("*".equalsIgnoreCase(mark)){
			return x * y;
			
		}else if("/".equalsIgnoreCase(mark)){
			if(y == 0){
				System.out.println("��������Ϊ��");
				return 0;
			}
			return x / y;
		}
		return 0;
	}
	
	/**
	 * ��x��ֵ
	 * @return
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * ��ȡx��ֵ
	 * @param x
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * ��y��ֵ
	 * @return
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * ��ȡy��ֵ
	 * @param y
	 */
	public void setY(int y){
		this.y = y;
	}
	
	public void setMark(String mark){
		this.mark = mark;
	}
	
	public String getMark(){
		return mark;
	}
	
	/**
	 * �ж��Ƿ�����
	 * @param str
	 * @return
	 */
	public boolean isNumberlic(String str){
		char arr[] = str.toCharArray();
		int len = arr.length;
		
		for(int i = 0;i < len;i++){
			if(arr[i] < '0' || arr[i]>'9'){
				//System.out.println("������������������");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �ж�������Ƿ���Ч
	 * @param str
	 * @return
	 */
	public boolean isValidMark(String str){
		String [] array = {"+","-","*","/"};
		
		for(String item: array){
			if(str.equals(item)){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean setX(String str){
		if(str != null && str.length() > 0){
			if(isNumberlic(str)){
				int value = Integer.valueOf(str);//�����ַ���ת����int���͵�ֵ
				setX(value);
				return true;
			}
		}else{
			System.out.println("x����Ϊ��");
			return false;
		}
		
		return false;
	}
	
	public boolean setY(String str){
		if(str != null && str.length() > 0){
			if(isNumberlic(str)){
				int value = Integer.valueOf(str);
				setY(value);
				return true;
			}
		}else{
			System.out.println("y����Ϊ��");
			return false;
		}
		
		return false;
	}
	
}
	