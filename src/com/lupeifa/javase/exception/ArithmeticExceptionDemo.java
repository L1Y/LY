package com.lupeifa.javase.exception;

//import java.util.Scanner;
/**
 * 
 * @author Lu
 *
 *一，异常与错误的区别：
 *1，错误是会中断异常，而异常不会
 *
 *二，try、catch代码的执行顺序
 *    如果try
 */
public class ArithmeticExceptionDemo {
	
	public static void main(String[] args){
		
		/*Scanner sc = new Scanner(System.in);
		int num1;
		int num2;*/
		try{
		     /*System.out.println("输入数字num1：");
		    num1 = sc.nextInt();
		    System.out.println("输入数字num2：");
		    num2 = sc.nextInt();
		    System.out.println("num1/num2="+num1/num2);*/
			
			/**/
		    System.out.println(1/0);
		    
		    int[] array = new int[1];
		    System.out.println(array[2]);
		}
	    catch(ArithmeticException e){
	    	e.printStackTrace();
	    	System.out.println("除数不能为0");
	    	}
	    catch(ArrayIndexOutOfBoundsException e){
	    	e.printStackTrace();
	    	System.out.println("数组越界了");
	    	}
		System.out.println("异常处理结束");
	    }
}
