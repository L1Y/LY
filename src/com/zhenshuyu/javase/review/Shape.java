package com.zhenshuyu.javase.review;

public abstract class Shape {
	private double width;
	private double height;
	private String name;
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Shape(double width, double height , String name){
		this(width,height);
		this.name=name;
	}
	public Shape(double width, double height){
		this.width=width;
		this.height=height;
	}
	public abstract double getShape();
		
	

}
