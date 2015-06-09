package com.tuyongkang.javase.inherit;

public class Square extends Shape{
	//���췽��������
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
