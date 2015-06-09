package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 *
 *	try/catch嵌套：
 *	1，在内嵌套try之前如果引出异常，内嵌套将不会执行，否则就会执行，再执行完内嵌套代码块后继续执行外嵌套后面的代码
 */
public class NestTry {
	public static void main(String[] args){
		nest1();
//		System.out.println("**********************************");
		//nest2();
		//nest3();
		//nest4();
	}
	
	public static void nest1(){
		try{
			try{
				int[] array = new int[1];
				System.out.println(array[3]);
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			
			System.out.println(1/0);
		}catch(ArithmeticException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	public static void nest2(){
		try{
			System.out.println(1/0);
			
			try{
				int[] array = new int[1];
				System.out.println(array[2]);
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
			}
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
	public static void nest3(){
		try{
			System.out.println(1/0);
		}catch(ArithmeticException e){
			e.printStackTrace();
			
			try{
				int[] array = new int[1];
				System.out.println(array[2]);
			}catch(ArrayIndexOutOfBoundsException ex){
				ex.printStackTrace();
			}
		}
	}
	
	/**
	 * Throwable类printStackTrace()方法是是在线程中执行的
	 */
	public static void nest4(){
		nest2();
		System.out.println("**********************************");
		nest1();
	}
}
