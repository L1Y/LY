package com.panxiaoguang.javase.inherit;

public class Triangle extends Shape{
	public Triangle(){
		super();
	}
	
	public Triangle(double width,double height){
		super(width,height);
	}
	
	public Triangle(double width,double height,String name ){
		super(width,height,name);
	}
	
	public double getArea(){
		//return 1/2*getWidth()*getHeight();//��������д����������1/2=0.5������һ��double����0
		return getWidth() * getHeight() * 1/2;
	}
}
