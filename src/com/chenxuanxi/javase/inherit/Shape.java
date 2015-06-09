/**
 * 
 */
package com.chenxuanxi.javase.inherit;

/**
 * @author Daniel Chan
 *
 */
abstract class Shape {

	private  String name;
	private double width;
	private double height;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Shape(){
		
	}
	
	//构造方法的重载
	public Shape(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Shape(double width, double height, String name){
		this(width, height);
		this.name = name;
	}
	
	public abstract double getArea();

}
