package com.yangqiuhua.javase.review;

public class Circle {
	private double radius;
	private final double PAI = 3.14;
	
	public double getArea(){
		return PAI*radius*radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}

}
