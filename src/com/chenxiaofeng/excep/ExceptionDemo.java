package com.chenxiaofeng.excep;
import java.util.Random;

public class ExceptionDemo {

	public static void main(String[] args){
		try{
			int x=new Random().nextInt();
			System.out.println("尝试用任意数字除以0："+x+"/0 = ");
			System.out.println(x/0);
		}
		catch(Exception e){
			System.out.println("捕获"+e.getClass().getSimpleName()+"异常");
		}

		try{
			int[] array=new int[]{1,2};
			System.out.println("尝试访问数组{1,2}的第3个元素");
			System.out.println(array[2]);
		}
		catch(Exception e){
			System.out.println("捕获"+e.getClass().getSimpleName()+"异常");
		}
	}
}
