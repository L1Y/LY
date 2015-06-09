package com.yyw.javase.exception;

import java.util.Random;

public class NextTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[2];
		Random random = new Random();
		try{
			int i = random.nextInt();
			if(i > 0){
				System.out.println(1/0);
			}else{
				System.out.println(arr[2]);
			}
		}catch(ArithmeticException e){
			System.out.println("算术异常");
			e.printStackTrace();
			try{
				System.out.println(arr[2]);
			}catch(ArrayIndexOutOfBoundsException r){
				System.out.println("catch嵌套数组超出异常");
				e.printStackTrace();
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组超出异常");
			e.printStackTrace();
		}
	}

}
