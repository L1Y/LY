package com.yangxm.javase.oop;

public class Trangle {
	private double width;
	private double height;
	private String name;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Trangle(){
		
	}
	
	public Trangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Trangle(double width, double height, String name){
		this(width, height);
		this.name = name;
	}
	
	public double getArea(){
		return width * height / 2;
	}
	
	public double getArea(double width, double height){
		this.width = width;
		this.height = height;
		
		return getArea();
	}
}
