package com.zouyuejian.javase.inherit;

public class Triangle extends Shape{
	public Triangle(){
		super();
	}
	public Triangle(double height, double width, String name){
		super(height,width,name);
	}
	public Triangle(double height, double width){
		super(height, width);
	}
	
	@Override
	public double getArea(){
		return getHeight() * getWidth() / 2;
	}
}
