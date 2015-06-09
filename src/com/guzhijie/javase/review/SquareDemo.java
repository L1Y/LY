package com.guzhijie.javase.review;

public class SquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
      
		System.out.println("面积为：" + square.getArea());
		
		Square square1 = new Square(15,20);
		
		System.out.println("面积为：" + square1.getArea());
	}

}