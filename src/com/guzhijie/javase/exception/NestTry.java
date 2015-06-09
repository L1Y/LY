package com.guzhijie.javase.exception;

public class NestTry {
	public static int a = 1;
	public static int b = 0;
	public static int c[] = new int[10];
	
	public static void nest1(){
		try{
			
			try{
				System.out.println(c[11]);
			}catch(ArrayIndexOutOfBoundsException f){
				f.printStackTrace();
			}
			System.out.println(a / b);
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		
	}
	
	public static void nest2(){
		try{
			System.out.println(a / b);
			try{
				System.out.println(c[11]);
			}catch(ArrayIndexOutOfBoundsException f){
				f.printStackTrace();
			}
			
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		nest1();
		nest2();


	}

}
