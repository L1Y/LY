package com.yyw.javase.inherit;

public class Triangle extends Shape{
	Triangle(){
		super();
	}
	Triangle(double width, double heigh){
		super(width, heigh);
	}
	Triangle(String name, double width, double heigh){
		super(name, width, heigh);
	}
	
	@Override
	public double getArea(){
		return getWidth() * getHeigh() / 2;
	}
	public double getArea(double width, double heigh){
		return width * heigh / 2;
	}
	
	@Override
	public String toString(){
		String str = super.getName()
				+ "\nwidth:" + super.getWidth()
				+ "\nheigh:" + super.getHeigh()
				+ "\narea: " + this.getArea();
		return str;
	}
}
