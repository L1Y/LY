package com.chenxiaofeng.extend;

public class Square extends Shape{
	private double height;
	private double width;
	
	public Square(){}
	
	public Square(double h,double w){
		height=h;
		width=w;
		name="Square";
	}
	
	public Square(double h,double w,String n){
		this(h,w);
		name=n;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double h){
		height=h;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double w){
		width=w;
	}
	
	public double getArea(){
		return height*width;
	}
	
	public double getArea(double h,double w){
		return new Square(h,w).getArea();
	}

}
