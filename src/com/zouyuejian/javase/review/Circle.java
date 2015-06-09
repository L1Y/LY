package com.zouyuejian.javase.review;

public class Circle {
	private double r;
	private final double PI = 3.14;
	private String name;
	public void setR(double r){
		this.r = r;
	}
	public double getR(){
		return r;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public double getArea(){
		return PI * PI * r;
	}
	
	public double getArea(double r){
		this.r = r;
		return getArea();
	}
	
	public Circle(){
		
	}
	public Circle(double r){
		this.r = r;
	}
	public Circle(double r ,String name){
		this(r);
		this.name = name;
	}
}
