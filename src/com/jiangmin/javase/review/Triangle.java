package com.jiangmin.javase.review;

public class Triangle {
	private double width;
	private double heigth;
	private String name;

	public Triangle() {

	}

	public Triangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public Triangle(double width, double heigth, String name){
		this(width,heigth);
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getArea() {
		return width * heigth / 2;
	}

	public double getArea(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
		return getArea();
	}
}
