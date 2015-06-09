package com.zouyuejian.javase.inherit;
/**
 * 定义一个抽象类shape类，里面有相应的属性和方法
 * @author jam
 *
 */
public abstract class Shape {
	private double height;
	private double width;
	private String name;
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	/**
	 * 定义抽象方法
	 * @return
	 */
	public abstract double getArea();
	
	public Shape(){
		
	}
	
	public Shape(String name){
		this.name = name;
	}
	public Shape(double height,double width){
		this.height = height;
		this.width = width;
	}
	public Shape(double height,double width,String name){
		this(height,width);
		this.name =name;
	}
}
