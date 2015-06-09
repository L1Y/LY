package com.yangqiuhua.javase.review;

public class Triangle {
	private double width;
	private double height;
	
	public Triangle(double width, double height){
		this.width = width;
		this.height =  height;
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
	
	public double getArea(double width, double height){
		return width*height*0.5;
	}
}
