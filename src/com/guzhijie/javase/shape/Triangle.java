package com.guzhijie.javase.shape;

public class Triangle {
	private double height;
	private double width;
	private String name;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Triangle(){
		this.height = 10;
		this.width = 10;
	}
	
	public Triangle(double height, double width){
		this.height = height;
		this.width =width;
	}
	
	public Triangle(double height, double bottom, String name){
		this(height, bottom);
		this.name = name;
	}
	
	public double getArea(){
		return height * width / 2;
	}
	
	public double getArea(double height, double width){
		this.height = height;
		this.width = width;
		return height * width / 2;
	}
}   

