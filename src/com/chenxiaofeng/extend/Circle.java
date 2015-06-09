package com.chenxiaofeng.extend;

public class Circle extends Shape{
	private double radius;

	public Circle(){}
	
	public Circle(double r){
		radius=r;
		name="Circle";
	}
	
	public Circle(double r,String n){
		this(r);
		name=n;
	}
	
	public void setRadius(double r){
		radius=r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public double getArea(double r){
		return new Circle(r).getArea();
	}
}
