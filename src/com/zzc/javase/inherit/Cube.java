package com.zzc.javase.inherit;

public class Cube extends Square {
	private double depth;
	
	public double getV() {
		return super.getArea() * depth;
	}
	public Cube() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Cube(double height, double width, double depth, String name) {
		super(height, width, name);
		this.depth = depth;
		// TODO �Զ����ɵĹ��캯�����
	}
	public Cube(double height, double width,double depth) {
		super(height, width);
		this.depth = depth;
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return super.getArea() ;
	}
	@Override
	public double getArea(double width, double height) {
		// TODO �Զ����ɵķ������
		return super.getArea(width, height);
	}
	
	
}
