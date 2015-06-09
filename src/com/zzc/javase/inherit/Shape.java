package com.zzc.javase.inherit;

public abstract  class Shape {
	private String name;
	private double height;
	private double width;

	
	public Shape() {
	}

	
	public Shape(double height, double width) {
		
		this.height = height;
		this.width = width;
	}

	public Shape(String name, double height, double width) {
		this(height ,width);
		this.name = name;
//		this.height = height;
//		this.width = width;
	}

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
	
	//抽象类的子类必须把父类中的抽象方法全部覆盖（重写）才能被实例化。否则，其子类还是抽象类
	public abstract double getArea();
	
	public double getArea(double width,double height){
		return width * height;
	}

}
