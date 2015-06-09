package com.liduan.javase.oop;

//如果class被public修饰的话，就必须跟java文件名保持一致
//一个类里面只有能一个class被public修饰
/**
 * 
 * @author Leo
 *	定义一个方形类，带有计算面积的方法
 */
public class Square {
	//定义一个属性：修饰符 类型 变量名称
	private double width;
	double height;
	private String name;
	
	/**
	 * 构造方法
	 * 1，构造的名称与类同名
	 * 2，构造没有返回值
	 * @param width
	 */
	public Square(){
		
	}
	
	//构造方法的重载
	public Square(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Square(double width, double height, String name){
		this(width, height);
		this.name = name;
	}
	
	public Square(String name, double width, double height){
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getArea(double width, double height){
		this.width = width;
		this.height = height;
		
		return getArea();
	}
	
//	//方法的重载跟返回值没有关系
//	public int getArea(double width, double height){
//		return 0;
//	}
	
	//定义一个set方法
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		height = 16;//演示值传递
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
