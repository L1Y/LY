/**
 * 
 */
package com.chenxuanxi.javase.review;


/**
 * @author Daniel Chan
 *定义类
 */
public class Calculator {

	/**
	 * 定义实例变量
	 * @param args
	 */
	private int x ; 
	private int y ;
	private String mark;
	
	/**
	 *判断mark是否符合运算规则 
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
	 * 定义带参数的构造方法
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
	 * 判断输入的字符串是否为纯数字
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
				System.out.println("输入有误，请重新输入");
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
				System.out.println("输入有误，请重新输入");
				
				return false;
			}
		}else{
			System.out.println("X不能为空，请重新输入");
			
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
				System.out.println("输入有误，请重新输入");

				return false;
			}
		}else{
			System.out.println("Y不能为空，请重新输入");

			return false;
		}
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













