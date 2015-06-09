package com.zzc.javase.calculator;

public class Calculator{
	private int x;//第一个参数
	private int y;//第二个参数
	String mark;//运算符
	
	/**
	 * 构造方法
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
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 取得运算结果
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
				System.out.println("除数不能为零");
				return 0;
			}
			return x / y;
		}
		return 0;
	}
	
	/**
	 * 给x赋值
	 * @return
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * 获取x的值
	 * @param x
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * 给y赋值
	 * @return
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * 获取y的值
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
	 * 判断是否纯数字
	 * @param str
	 * @return
	 */
	public boolean isNumberlic(String str){
		char arr[] = str.toCharArray();
		int len = arr.length;
		
		for(int i = 0;i < len;i++){
			if(arr[i] < '0' || arr[i]>'9'){
				//System.out.println("输入有误，请重新输入");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断运算符是否有效
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
				int value = Integer.valueOf(str);//数字字符串转换成int类型的值
				setX(value);
				return true;
			}
		}else{
			System.out.println("x不能为空");
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
			System.out.println("y不能为空");
			return false;
		}
		
		return false;
	}
	
}
	