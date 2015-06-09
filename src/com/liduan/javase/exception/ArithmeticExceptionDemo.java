package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 * 
 * 一，异常与错误的区别：
 * 1，错误是会中断程序，而异常不会
 *
 * 二，try、catch代码的执行顺序
 * 	如果try中有多个异常情况时，当第一个异常被引出的时候，try中的代码会中断执行同时转到相应的catch代码块中
 */
public class ArithmeticExceptionDemo {
	public static void main(String[] args){
		try{
			/*可能会发生异常的代码*/
			
			int[] array = new int[1];
			System.out.println(array[2]);
			
			System.out.println(1/0);
		}catch(ArithmeticException e){
			/*当异常发生时，执行的代码*/
			e.printStackTrace();
			System.out.println("除数不能为0");
			/*当异常发生时，执行的代码*/
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("数组越界了");
		}
		
		System.out.println("异常处理结束");
	}
}
