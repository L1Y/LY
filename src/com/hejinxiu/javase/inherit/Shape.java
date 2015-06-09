package com.hejinxiu.javase.inherit;

public abstract class Shape {
	private String name;
	public double width;
	public double hight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public double getArea(double width,double hight){
		return width * hight;
	}
	
	public Shape(){
		
	}
	public Shape(double width,double hight){
		this.width=width;
		this.hight=hight;
	}
	public Shape(double width,double hight,String name){
		this(width,hight);
		this.name=name;
	}
	/**
	 * �����ֻ࣬�Ƕ�����һ�����������ǲ�֪����ô�ã������ÿһ���̳������࣬���в�ͬ��ʵ�ַ����������������������ÿһ������д�������.
	 * @return
	 */
	public abstract double getArea();
		
}
