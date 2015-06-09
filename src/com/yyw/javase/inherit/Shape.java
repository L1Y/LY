package com.yyw.javase.inherit;

public abstract class Shape {
	private String name;
	private double width;
	private double heigh;
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
	public double getHeigh() {
		return heigh;
	}
	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}
	
	/**
	 * 
	 */
	Shape(){
		
	}
	Shape(double width, double heigh){
		this.width = width;
		this.heigh = heigh;
	}
	Shape(String name, double width, double heigh){
		this(width, heigh);
		this.name = name;
	}
	
	/**
	 * 
	 */
	public abstract double getArea();
	public abstract double getArea(double width, double heigh);
}
