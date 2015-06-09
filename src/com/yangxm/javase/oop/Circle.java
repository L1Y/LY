package com.yangxm.javase.oop;

public class Circle {
	private double r;
	private final double pi = 3.14;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getPi() {
		return pi;
	}
	
	public Circle(){
		
	}
	
	public Circle(double r){
		this.r = r;
	}
	
	public Circle(double r, String name){
		this(r);
		this.name = name;
	}
	
	public double getArea(){
		return pi * r * r;
	}
	
	public double getArea(double r){
		this.r = r;
		
		return getArea();
	}
}
