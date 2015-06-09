package com.yangqiuhua.javase.review;

public class Square  {
	
	private double high;
	private double wide;
	private String name;
	
	public double getHigh(){
		return high;
	}
	
	public void setHigh(double high){
		this.high = high;
	}
	
	public void setWide(double wide){
		this.wide = wide;
	}
	
	public double getWide(){
		return wide;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	

	public double getArea(){
	    double area ;
		area = high * wide;
		
		return area;
	}
	
	public double getArea(double high,double wide){
	
		return high*wide;
	}
	
	public Square(double high ,double wide, String name){
		this(high,wide); //构造方法中可以直接调用构造方法→增强代码的重用性
		this.name = name;
		}
	//构造方法的重载
	public Square(double high ,double wide){
		this.high = high;
		this.wide = wide;
		}

	public static void main(String[] args) {
		//Square square = new Square(15,20);
		//System.out.println("该矩形的面积为：" + square.getArea());
		
	}

}
