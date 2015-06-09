package com.cjq.javase.oop.inherit;

/**
 * 这是一个与三角形有关的类。
 * 
 * @author i_Mjunqi
 *
 */
public class Triangle extends Shape {

	public Triangle(double bottom, double height) {
		super(bottom, height);
	}

	/**
	 * 求三角形的面积。
	 * 
	 * @return
	 */
	@Override
	public double getArea() {
		return this.getWidth() * this.getHeight() / 2;
	}

	@Override
	public double getArea(double width, double height) {
		return width * height / 2;
	}

	public static void main(String[] args) {
		Triangle t = new Triangle(10, 5);
		System.out.println("三角形1的面积为：" + t.getArea());
		System.out.println("三角形2的面积为：" + t.getArea(5,7));
	}

}
