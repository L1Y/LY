package com.lupeifa.javase.inherit;

public abstract class Shape {
	private String name;
	private double width;
	private double height;
	
	public abstract double getArea();
	
	public Shape(){

	}
	
    public Shape(double width,double height){
		this.height=height;
		this.width=width;

	}
	
    public Shape(double width,double height,String name){
		this(width, height);
		this.name = name;
	}
	
	public void setWidth(double width){
		this.width=width;	
	}
	
	public double getWidth(){
		return width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
