package com.jiangmin.javase.inherit;

public class ShapeDemo {

	public static void main(String[] args) {
		Square square = new Square(12,20);
		System.out.println(square.getArea());
		
		Triangle triangle = new Triangle(45,2);
		System.out.println(triangle.getArea());
	}

}
