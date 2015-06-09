package com.zhenshuyu.javase.review;

public abstract class ShapeDemo  extends  Shape{
	public static void main(String args[]){
//		ShapeDemo shape =new ShapeDemo(6.0, 7.0);
//		System.out.println(shape.getAear());
//		
	}

	public ShapeDemo(double width, double height, String name) {
		super(width, height, name);
		// TODO 自动生成的构造函数存根
	}

	public ShapeDemo(double width, double height) {
		super(width, height);
		// TODO 自动生成的构造函数存根
	}
	public double getAear(){
		return getWidth() * getHeight();
	}

	@Override
	public String toString() {
		return "ShapeDemo []";
	}
	@Override 
	public  double getShape(){
		return getWidth() * getHeight();
	}
	
}
