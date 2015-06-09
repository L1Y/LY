package com.cjq.javase.oop.inherit;

/**
 * 这是一个用来表示矩形或者三角形的父类。
 * 
 * @author i_Mjunqi
 *
 */
public abstract class Shape {

	private double width;
	private double height;
	private String name;

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

	public Shape() {

	}

	/**
	 * 带参构造函数，用来初始化变量
	 * 
	 * @param width
	 * @param height
	 */
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Shape(double width, double height, String name) {
		this(width, height);
		this.name = name;
	}

	/**
	 * 求面积
	 * 
	 * @return
	 */
	public abstract double getArea();

	// return width * height;

	/**
	 * 直接传入参数求面积
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	public abstract double getArea(double width, double height);
	// this.width = width;
	// this.height = height;
	//
	// return getArea();
}
