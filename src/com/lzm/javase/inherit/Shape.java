package com.lzm.javase.inherit;

public abstract class Shape {
	private double width;
	private double height;
	private String name;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	
	public Shape(String name, double width, double height) {
		this(width, height);
		setName(name);
	}
	
	/**
	 * 定义抽象方法
	 * @return
	 */
	public abstract double getArea();
	public abstract double getArea(double width, double height);
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
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
}
