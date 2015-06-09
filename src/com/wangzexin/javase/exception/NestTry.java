package com.wangzexin.javase.exception;

public class NestTry {

	public static void main(String[] args) {

		int x = 3;
		int y = 0;
		int[] array = new int[10];
		try {
			System.out.println(x / y);

		} catch (ArithmeticException e) {
			System.out.println("Math Error");
			try {
				for (int i = 0; i < 11; i++) {
					array[i] = i;
				}
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("Array Error");
			}
		} finally {
			System.out.println("over");
		}
	}

}	