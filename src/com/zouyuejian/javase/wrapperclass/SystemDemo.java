package com.zouyuejian.javase.wrapperclass;

public class SystemDemo {
	public static void main(String[] args) {
		int[] array = new int[100];
		int len = array.length;
		int[] array2 = new int[len];
		long l1 = System.currentTimeMillis();
		for(int i = 0; i < len;i++){
			array[i] = i;
			System.out.println(array[i]);
		}
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
		long l3 = System.currentTimeMillis();
		System.arraycopy(array, 0, array2, 0, len);
		for (int i = 0;i<len;i++) {
			System.out.println(array2[i]);
		}
		long l4 = System.currentTimeMillis();
		System.out.println(l4-l3);
	}
}
