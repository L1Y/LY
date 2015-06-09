package com.hejinxiu.javase.inherit;

public abstract class Shape {
	private String name;
	public double width;
	public double hight;
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
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public double getArea(double width,double hight){
		return width * hight;
	}
	
	public Shape(){
		
	}
	public Shape(double width,double hight){
		this.width=width;
		this.hight=hight;
	}
	public Shape(double width,double hight,String name){
		this(width,hight);
		this.name=name;
	}
	/**
	 * 抽象类，只是定义了一个方法，但是不知道怎么用，针对于每一个继承他的类，都有不同的实现方法，所以这个方法必须在每一个类重写这个方法.
	 * @return
	 */
	public abstract double getArea();
		
}
