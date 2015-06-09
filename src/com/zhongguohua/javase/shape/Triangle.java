package com.zhongguohua.javase.shape;

public class Triangle extends Shape{
	public Triangle(){
		
	}
	
	public Triangle(double width,double height){
		super.setHeight(height);
		super.setWidth(width);
	}
	
	public Triangle(double width, double height, String name){
		this(width,height);
		super.setName(name);
		
	}
	
	public double getArea(){
		return  super.getHeight() * super.getWidth() / 2;
	}
	
	public double getArea(double width,double height){
		super.setHeight(height);
		super.setWidth(width);
		return width * height / 2;
	}
}
