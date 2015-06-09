package com.zouyuejian.javase.inherit;
/**
 * 定义一个Square类，继承shape类
 * @author jam
 *
 */
public class Square extends Shape {
	public Square(){
		
	}
	public Square(double width, double height){
		super(height,width);
	}
	
	public Square(double width, double height,String name){
		super(height,width,name);
	}
	
	@Override
	public double getArea(){
		return getHeight() * getWidth();
	}
}
