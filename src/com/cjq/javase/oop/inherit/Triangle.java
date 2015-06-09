package com.cjq.javase.oop.inherit;

/**
 * ����һ�����������йص��ࡣ
 * 
 * @author i_Mjunqi
 *
 */
public class Triangle extends Shape {

	public Triangle(double bottom, double height) {
		super(bottom, height);
	}

	/**
	 * �������ε������
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
		System.out.println("������1�����Ϊ��" + t.getArea());
		System.out.println("������2�����Ϊ��" + t.getArea(5,7));
	}

}
