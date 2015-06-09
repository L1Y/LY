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
	 * ���췽��������
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
		System.out.println("����1�����Ϊ��" + s.getArea());
		System.out.println("����2�����Ϊ��" + s.getArea(5,8));
	}

}
