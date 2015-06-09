package com.xurui.javase.review;

public class SquareDemo {
	private static final String TAG = SquareDemo.class.getSimpleName();
	public static void main(String[] args) {
		Square rectangle = new Square(15,20);
		System.out.println(TAG + ":::" + rectangle.getArea());

	}

}
