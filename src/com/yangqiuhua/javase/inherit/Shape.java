package com.yangqiuhua.javase.inherit;

public abstract class Shape {
	private String name;
	private double width;
	private double height;
	
	public abstract double getArea();//���󷽷�ֻ�ܶ����ڳ������У��Ҳ���Ҫ�����壬������Ҫ��";"
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}


}
