package com.guzhijie.javase.review;

public class SquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
      
		System.out.println("���Ϊ��" + square.getArea());
		
		Square square1 = new Square(15,20);
		
		System.out.println("���Ϊ��" + square1.getArea());
	}

}