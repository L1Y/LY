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
	 * ����һ��getNUm�ķ������ж��������Ƿ��������
	 * @param num
	 */
	public static void getNum(int num){
		ExceptionDemo myDemo = new ExceptionDemo();
		if(num>=1&&num<=10){
			System.out.println(myDemo.MyFinally() );
		}else{
			System.out.println(myDemo.MyCatch() + "  ����������쳣   ");
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
