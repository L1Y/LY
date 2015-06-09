package com.zzc.javase.review;

public class Square {
	private double height;
	private double width;
	private String name;

	public Square(){
		
	}
	
	public Square(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public Square(double height, double width, String name) {
		this(height,width);
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected double getArea() {
		return height * width;
	}

	protected double getArea(double height, double width) {
		return height * width;
	}

}
