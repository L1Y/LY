package com.yyw.javase.exception;

import java.util.Random;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根

		try{
			System.out.println("呵呵");
			int[] a = new int[]{1,0};
			Random r = new Random();
			int b = r.nextInt();
			//大于0数组超出，小于0算术错误
			if(b > 0){
				System.out.println(b);
				a[3] = b;
			}
			System.out.println(b);
			a[1]=a[0] / a[1];
			
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("好长");
			e.printStackTrace();
		}catch(ArithmeticException e){
			System.out.println("这也好长");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e.toString());
			e.printStackTrace();
			
		}finally{
			System.out.println("呵呵");
		}
	}

}
