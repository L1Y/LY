package com.zzc.javase.inherit;

public class Triangle extends Shape{
	public static void main(String []args){
		Triangle tri = new Triangle(2.0,3.0);
		System.out.println(tri.getArea());
	}

	public Triangle() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Triangle(double height, double width) {
		super(height, width);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public Triangle(String name, double height, double width) {
		super(name, height, width);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return  getHeight() * getWidth();
	}
	
	@Override
	public double getArea(double width, double height) {
		// TODO �Զ����ɵķ������
		return super.getArea(width, height) / 2;
	}
}
