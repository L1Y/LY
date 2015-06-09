package com.liduan.javase.oop;

public class SquareDemo {

	public static void main(String[] args) {
		SquareDemo sd = new SquareDemo();
		String str = "Hello";
		System.out.println(str);
		sd.change(str);
		System.out.println(str);
		
		Square square = new Square(10, 15);
		System.out.println(square.getArea());
		sd.change(square);
		System.out.println(square.getArea());
		square.setHeight(0);
		System.out.println("getHeight():::" + square.getHeight());
		
	}
	
	public void change(String str){
		str = str.replace("e", "u");

		System.out.println(str);
	}
	
	public void change(Square sa){
		sa.height = 10;
	}

}
