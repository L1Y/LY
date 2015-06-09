package com.guzhijie.javase.inherit;

public class Square extends Shape {
	public Square(double height, double width){
		super(height, width);
	}
	
	public Square(double height, double width, String name){
		super(height, width, name);
	}
	public double getArea(){
		return getHeight() * getWidth();
	}
}
