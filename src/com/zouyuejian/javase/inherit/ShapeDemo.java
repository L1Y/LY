package com.zouyuejian.javase.inherit;

public class ShapeDemo {
	public static void main(String[] args){
		Triangle tr = new Triangle(5,10);
		Square sq = new Square();
		System.out.println(tr.getArea());
		sq.setHeight(12);
		sq.setWidth(10);
		System.out.println(sq.getArea());
	}
}
