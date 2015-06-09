package com.jiangmin.javase.inherit;

public class Square extends Shape {
	public Square() {

	}

	public Square(double width, double height) {
		super(width, height);
	}

	@Override
	public double getArea() {
		return getHeight() * getWidth();
	}
}
