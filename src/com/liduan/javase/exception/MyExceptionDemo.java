package com.liduan.javase.exception;

public class MyExceptionDemo {

	public static void main(String[] args) {
		compute(1);
		compute(11);
	}

	public static void compute(int x) {
		System.out.println("x:" + x);
		try {
			if (x > 10) {
				throw new MyException(x);
			}
		} catch (MyException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
