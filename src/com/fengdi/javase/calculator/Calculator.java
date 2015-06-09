package com.fengdi.javase.calculator;
/**
 * 定义类的属性
 * @author Administrator
 *
 */
public class Calculator {
	private int x ;	
	private int y ;
	private String mark ;
/**
 * 判断字符串是否为纯数字
 * @param str
 * @return
 */
	public boolean isNumberic(String str){
		char[] array = str.toCharArray();
		int len = array.length ;
		for(int i = 0; i<len;i++ ){
			char item = array[i];
			if(item >= '0' && item <= '9'){
				
			}else
			return false ;
		}
		return true ;
	}
/**
 * 获取私有属性x,y,mark
 * @return
 */
	public int getX(){
		 return x ;
	}	 
	public void setX(int x){
		this.x = x ;
	}	 
	public int getY(){
		 return y ;
	}	 
	public void setY(int y){
		this.y = y ; 
	}	 
	public String getMark(){
		 return mark;
		 }
	public void setMark(String mark){
		this.mark = mark ;
	}
/**	
 * 把x转换为int类型
 * @param str
 * @return
 */
	public boolean setX(String str) {
		if(str != null && str.length() > 0){
			if(isNumberic(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}else{
				System.out.println("输入有误，请重新输入");
				
				return false;
			}
		}else{
			System.out.println("X不能为空，请重新输入");
			
			return false;
		}
	}	
	
/**	
 * 把y转换为int类型
 * @param str
 * @return
 */
	public boolean setY(String str) {
		if(str != null && str.length() > 0){
			if(isNumberic(str)){
				int value = Integer.valueOf(str);
				setY(value);
				
				return true;
			}else{
				System.out.println("输入有误，请重新输入");

				return false;
			}
		}else{
			System.out.println("Y不能为空，请重新输入");

			return false;
		}
	}
/**	
 * 判断运算符
 * @param str
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
 * 构造计算结果的方法
 * @return
 */
	public int getResult(){
		if("+".equalsIgnoreCase(mark)){
			return x+y ;
		}else if("-".equalsIgnoreCase(mark)){
			return x-y ;
		}else if("*".equalsIgnoreCase(mark)){
			return x*y ;
		}else if("/".equalsIgnoreCase(mark)){
			if(y == 0){
				System.out.println("y不能为0");
				return 0 ;
			}
			return x/y ;
		}
		return 0 ;
	}		
/**	
 * 有参数的构造函数
 * @param x
 * @param y
 * @param mark
 */
	public Calculator(int x , int y, String mark){
		this.x = x ;	
		this.y = y ;
		this.mark = mark ;
	}
}
