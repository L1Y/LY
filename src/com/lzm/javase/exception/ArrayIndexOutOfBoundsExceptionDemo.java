package com.lzm.javase.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
	
	int[] arr = {0, 1, 2, 3, 4};
	
	public void runException() {
		System.out.println(arr[5]);
	}

}
