package com.chenxiaofeng.extend;

public class Triangle extends Shape{
	private double bottom;
	private double height;
	
	public Triangle(){}
	
	public Triangle(double b,double h){
		bottom=b;
		height=h;
		name="Triangle";
	}
	
	public Triangle(double b,double h,String n){
		this(b,h);
		name=n;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double h){
		height=h;
	}
	
	public double getBottom(){
		return bottom;
	}
	
	public void setBottom(double w){
		bottom=w;
	}
	
	public double getArea(){
		return bottom*height/2;
	}
	
	public double getArea(double b,double h){
		return new Triangle(b,h).getArea();
	}
	
}
