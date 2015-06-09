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
		//return 1/2*getWidth()*getHeight();//不能这样写，会先运算1/2=0.5，返回一个double数是0
		return getWidth() * getHeight() * 1/2;
	}
}
