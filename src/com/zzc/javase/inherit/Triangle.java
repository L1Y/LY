package com.zzc.javase.inherit;

public class Triangle extends Shape{
	public static void main(String []args){
		Triangle tri = new Triangle(2.0,3.0);
		System.out.println(tri.getArea());
	}

	public Triangle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Triangle(double height, double width) {
		super(height, width);
		// TODO 自动生成的构造函数存根
	}
	
	public Triangle(String name, double height, double width) {
		super(name, height, width);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return  getHeight() * getWidth();
	}
	
	@Override
	public double getArea(double width, double height) {
		// TODO 自动生成的方法存根
		return super.getArea(width, height) / 2;
	}
}
