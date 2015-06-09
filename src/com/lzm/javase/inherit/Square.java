package com.lzm.javase.inherit;

public class Square extends Shape {

	public Square() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Square(double width, double height) {
		super(width, height);
	}
	
	public Square(String name, double width, double height) {
		super(name, width, height);
	}
	
	/**
	 * 覆写抽象类的抽象方法
	 */
	public double getArea() {
		return getWidth() * getHeight();
	}
	public double getArea(double width, double height) {
		setWidth(width);
		setHeight(height);
		
		return getWidth() * getHeight();
	}
	

	public void setHeight(double height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
	}
	public double getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}
	public double getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

}
