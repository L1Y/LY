/**
 * 
 */
package com.chenxuanxi.javase.ExcepTion;

/**
 * @author Daniel
 *
 */
public class NextTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			/*try中嵌套try-catch*/
			try{
				int [] b = {1,2,3};//引出数组指针异常
				System.out.println(b[4]);
			}catch(Exception e){ //e 为形参 ，以大括号为一个生命周期
				System.out.println(e.toString());
			}
			int a = 4/0; //引出算术异常
		}catch(Exception e){ //e 为形参 ，以大括号为一个生命周期
			System.out.println(e.toString());
			/*catch中嵌套try-catch*/
			try{
				int [] a = {1,2,3}; //引出数组指针异常
				System.out.println(a[4]);
			}catch(Exception d){
				System.out.println(d.toString());
			}
		}
	}

}
