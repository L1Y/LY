package com.zouyuejian.javase.inherit;
/**
 * ����һ��������shape�࣬��������Ӧ�����Ժͷ���
 * @author jam
 *
 */
public abstract class Shape {
	private double height;
	private double width;
	private String name;
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	/**
	 * ������󷽷�
	 * @return
	 */
	public abstract double getArea();
	
	public Shape(){
		
	}
	
	public Shape(String name){
		this.name = name;
	}
	public Shape(double height,double width){
		this.height = height;
		this.width = width;
	}
	public Shape(double height,double width,String name){
		this(height,width);
		this.name =name;
	}
}
