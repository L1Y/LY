package com.hejinxiu.javase.inherit;

public class Square extends Shape {
	public Square(double width,double hight){
		super(width,hight);
	}
	
	public Square(double width,double hight,String name){
		super(width,hight,name);
	}

	@Override
	/**
	 * 抽象类的方法重写!
	 */
	public double getArea() {
		return getHight() * getWidth();
	}
	
	

}
