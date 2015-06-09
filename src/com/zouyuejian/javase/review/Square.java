package com.zouyuejian.javase.review;

public class Square {
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
	
	public double getArea(){
		return height * width;
	}
	
	public double getArea(int height,int width){
		this.height = height;
		this.width = width;
		return height * width;
	}
	//构造方法重载
	public Square(){
		
	}
	
	public Square(int height,int width){
		this.height = height;
		this.width = width;		
	}
	
	public Square(int height,int width,String name){
		this(height,width);
		this.name = name;
	}
	
	public Square(String name , int height,int width){
		this(height,width);
		this.name = name;
	}
}
