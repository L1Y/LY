package com.cjq.javase.oop.inherit;

/**
 * ����һ��������ʾ���λ��������εĸ��ࡣ
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
	 * ���ι��캯����������ʼ������
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
	 * �����
	 * 
	 * @return
	 */
	public abstract double getArea();

	// return width * height;

	/**
	 * ֱ�Ӵ�����������
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
