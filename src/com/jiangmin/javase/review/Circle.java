package com.jiangmin.javase.review;

public class Circle {
	private double radius;
	private final double PI = 3.141592653D;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return PI * radius * radius;
	}
	
	public double getArea(double radius){
		this.radius = radius;
		return PI * radius * radius;
	}
	
}
