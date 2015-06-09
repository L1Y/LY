package com.jiangmin.javase.review;


public class SquareDemo {
	
	private static final String TAG = SquareDemo.class.getSimpleName();

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.getArea(6));
		
		Triangle triangle = new Triangle(2,3);
		System.out.println(triangle.getArea());
	}

}
