package com.zhangxurui.javase.inherit;

public abstract class Shape {
	private String name;
	private double height;
	private double width;
	
	public Shape(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	public Shape(){
		
	}
	
	public Shape(double width,double height,String name){
		this(width,height);
		this.name = name;
	}
	
	
	
	public abstract double getArea(double width,double height);
	public abstract double getArea();
	
	public double getArea(double width,double height ,String name){
		return width*height*0.5;
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
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	

}
