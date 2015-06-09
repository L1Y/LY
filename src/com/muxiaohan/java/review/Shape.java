package com.muxiaohan.java.review;

public class Shape {
	//共有的部分有哪些？width ,hight ,name;
	public double width;
	public double hight;
	public String name;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
		this.width = w;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double h) {
		this.hight = h;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getArea(){
		return width*hight;
	}
	
	public Shape(int h, int w,String n) {
		this.hight = h;
		this.width = w;
		this.name = n;
	}
	public double getArea(double w,double h){
		return getWidth()*getHight();
	}
	public static void main(String[] args) {

		
	}

}
