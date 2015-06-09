package com.cjq.javase.oop.inherit;

public class Square extends Shape {

	@Override
	public double getArea(){
		return this.getWidth() * this.getHeight();
	}
	
	@Override
	public double getArea(double width, double height) {
		return width * height;
	}
	
	/**
	 * 构造方法的重载
	 */

	public Square() {
		super();

	}

	public Square(double width, double height) {
		super(width, height);

	}

	public Square(double width, double height, String name) {
		super(width, height, name);

	}

	public static void main(String[] args) {
		Square s = new Square(5, 10);
		System.out.println("矩形1的面积为：" + s.getArea());
		System.out.println("矩形2的面积为：" + s.getArea(5,8));
	}

}
