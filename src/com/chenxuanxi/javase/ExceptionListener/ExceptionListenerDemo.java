/**
 * 
 */
package com.chenxuanxi.javase.ExceptionListener;

/**
 * @author Administrator
 *
 */
public class ExceptionListenerDemo {
	/**
	 * 声明一个getNUm的方法，判断输入数是否符合条件
	 * @param num
	 */
	public static void getNum(int num){
		ExceptionDemo myDemo = new ExceptionDemo();
		if(num>=1&&num<=10){
			System.out.println(myDemo.MyFinally() );
		}else{
			System.out.println(myDemo.MyCatch() + "  输入的数字异常   ");
			System.out.println(myDemo.MyFinally());
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionDemo myDemo = new ExceptionDemo();
		getNum(myDemo.MyTry());
	}
	
}
