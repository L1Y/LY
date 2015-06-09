package com.jiangmin.javase.inherit;

public class Triangle extends Shape{
	
	public Triangle(){
		
	}
	
	public Triangle(double width, double height){
		super(width,height);	
	}
	
	public Triangle(double width, double height, String name){
		super(width,height,name);
	}
	
	@Override
	public double getArea(){
		return getHeight() * getWidth() / 2;
	}
}
