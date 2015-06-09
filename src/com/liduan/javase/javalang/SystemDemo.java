package com.liduan.javase.javalang;

public class SystemDemo {
	public static void main(String[] args){
		System.out.println("SystemDemo");
		//System.out.println(System.console());
		int len = 10000000;
		int[] array = new int[len];
		for(int i = 0; i < len; i++){
			array[i] = i;
		}
		int[] array2 = new int[len];
		int[] array3 = new int[len];
		long t1 = System.currentTimeMillis();
		//System.out.println(t1);
		System.arraycopy(array, 0, array2, 0, len);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		long t3 = System.currentTimeMillis();
		
		for(int i = 0; i < len; i++){
			array3[i] = array[i];
		}
		long t4 = System.currentTimeMillis();
		System.out.println(t4 - t2);
		
	}
}
