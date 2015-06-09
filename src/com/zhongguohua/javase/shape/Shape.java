package com.zhongguohua.javase.shape;

public abstract class Shape {
	private String name;
	private double width;
	private double height;
	
	public abstract double getArea(double width, double height);
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
}
