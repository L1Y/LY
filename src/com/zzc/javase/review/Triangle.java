package com.zzc.javase.review;

public class Triangle {
	private double height;
	private double bottom;
	private String name;

	public Triangle(){
		
	}
	
	public Triangle(double height, double bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	public Triangle(double height, double bottom, String name) {
		this(height,bottom);
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public double getBottom() {
		return bottom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected double getArea() {
		return height * bottom / 2;
	}

	protected double getArea(double height, double bottom) {
		return height * bottom / 2;
	}

}