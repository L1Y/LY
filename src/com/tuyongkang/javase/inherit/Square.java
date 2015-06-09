package com.tuyongkang.javase.inherit;

public class Square extends Shape{
	//构造方法的重载
	public Square(double width, double height){
		super(width, height);
	}
	
	public Square(double width, double height, String name){
		super(width, height, name);
	}
	
	public double getArea(){
		return getWidth() * getHeight();
	}
}
