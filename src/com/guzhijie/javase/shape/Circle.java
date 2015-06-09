package com.guzhijie.javase.shape;

public class Circle {
	private double rad;
	private final double pi = 3.14;	
	private String name;
	
	public double getRad() {
		return rad;
	}
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	public double getPi(){
		return pi;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Circle(){
		rad = 5;
	}
	
	public Circle(double rad){
		this.rad = rad;
	}
	
	public Circle(double rad, String name){
		this(rad);
		this.name = name;
	}
	
	public double getArea(){
		return rad * rad * pi;
	}
	
	public double getArea(double rad){
		this.rad = rad;
		return rad * rad * pi;
	}
	
}
