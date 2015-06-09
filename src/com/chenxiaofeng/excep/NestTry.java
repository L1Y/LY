package com.chenxiaofeng.excep;

public class NestTry {
	public static void main(String[] args){
		int[] array=new int[]{1};
		try{
			try{
				System.out.println(array[2]);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(1/0);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
