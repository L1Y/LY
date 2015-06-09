package com.zzc.javase.inherit;

public class Cube extends Square {
	private double depth;
	
	public double getV() {
		return super.getArea() * depth;
	}
	public Cube() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Cube(double height, double width, double depth, String name) {
		super(height, width, name);
		this.depth = depth;
		// TODO 自动生成的构造函数存根
	}
	public Cube(double height, double width,double depth) {
		super(height, width);
		this.depth = depth;
		// TODO 自动生成的构造函数存根
	}
	
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return super.getArea() ;
	}
	@Override
	public double getArea(double width, double height) {
		// TODO 自动生成的方法存根
		return super.getArea(width, height);
	}
	
	
}
