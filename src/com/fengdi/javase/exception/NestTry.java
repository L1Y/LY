package com.fengdi.javase.exception;

public class NestTry {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int a = 4;
		int b = 0;
		try {
			 System.out.println(a / b);
			// try{System.out.println(array[5]);
			// }catch (ArrayIndexOutOfBoundsException e){
			// e.printStackTrace();
			// System.out.println("数组越界");
			// }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("被除数不能为0");
			try {
				System.out.println(array[5]);
			} catch (ArrayIndexOutOfBoundsException s) {
				s.printStackTrace();
				System.out.println("数组越界");
			}
		}

	}

}
