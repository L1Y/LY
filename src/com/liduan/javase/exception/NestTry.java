package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 *
 *	try/catchǶ�ף�
 *	1������Ƕ��try֮ǰ��������쳣����Ƕ�׽�����ִ�У�����ͻ�ִ�У���ִ������Ƕ�״��������ִ����Ƕ�׺���Ĵ���
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
	 * Throwable��printStackTrace()�����������߳���ִ�е�
	 */
	public static void nest4(){
		nest2();
		System.out.println("**********************************");
		nest1();
	}
}
