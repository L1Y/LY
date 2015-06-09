package com.zzc.javase.review;

public class Circle {
	private double radius;
	private String name;
	final double pi = 3.14;
	
	public Circle(){
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String name) {
		this(radius);
		this.name = name;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected double getArea() {
		return pi * radius * radius;
	}

	protected double getArea(double radius) {
		return pi * radius * radius;
	}

}