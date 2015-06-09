package com.zouyuejian.javase.review;

public class Triangle {
	private double bottom;
	private double height;
	private String name;
	public void setBottom(double bottom){
		this.bottom = bottom;
	}
	public double getBottom(){
		return bottom;
	}
	public void setHeight(double height ){
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
	
	public double getArea(){
		return bottom * height / 2;
	}
	
	public double getArea(double bottom,double height){
		this.bottom = bottom;
		this.height = height;
		return getArea();
	}
	
	public Triangle(){
		
	}
	public Triangle(double bottom,double height){
		this.bottom = bottom;
		this.height = height;
	}
	public Triangle(double bottom,double height,String name){
		this(bottom,height);
		this.name = name;
	}
}
