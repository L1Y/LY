package com.zhongguohua.javase.shape;

public class Square extends Shape{
	
	public Square(){
		
	}
	
	public Square(double width, double height){
		super.setHeight(height);
		super.setWidth(width);
		
	}
	
	public Square(double width, double height, String name){
		this(width,height);
		super.setName(name);
	}
	
	public double getArea(){
		return super.getHeight() * super.getWidth();
	}
	
	public double getArea(double width, double height){
		super.setHeight(height);
		super.setWidth(width);
		return width * height;
	}
}
