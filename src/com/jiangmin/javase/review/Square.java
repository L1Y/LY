package com.jiangmin.javase.review;

public class Square {
	private double width;
	private double length;
	private String name;

	public Square() {

	}

	public Square(double width, double length) {
		this.width = width;
		this.length = length;
	}

	/**
	 * ͨ���ɵĹ��췽���Լ�����this()�Ĺ��췽�������Ը�ֵ
	 * @param width
	 * @param length
	 * @param name
	 */
	public Square(double width, double length, String name) {
		this(width,length);
		this.name = name;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getArea(double width, double legnth) {
		this.width = width;
		this.length = length;
		return width * legnth;
	}

	public double getArea() {
		return width * length;
	}

}
