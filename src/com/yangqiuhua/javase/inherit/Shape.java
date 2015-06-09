package com.yangqiuhua.javase.inherit;

public abstract class Shape {
	private String name;
	private double width;
	private double height;
	
	public abstract double getArea();//抽象方法只能定义在抽象类中，且不需要方法体，语句结束要有";"
	
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
