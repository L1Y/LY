package com.chenxuanxi.javase.inherit;

public class Square extends Shape{
	
	public Square(){
		super();
	}
	
	public Square(double width , double height){
		super(width,height);
	}
	
	public Square(double width, double height, String name){
		super(width, height, name);
	}
	
	public double getArea(){
		return getWidth() * getHeight();
	}
	
	@Override
	public String toString() {
		return super.toString() + "我已经被重写了";
	}
}
