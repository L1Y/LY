package com.guzhijie.javase.inherit;

public class Shape {
	private String name;
	private double height;
	private double width;
	
	
	public String getNmae(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height =height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	
	public Shape(){
		
	}
	
	public Shape(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	
	public Shape(double height, double width, String name){
		this.height = height;
		this.width = width;
		this.name = name;
	}
	

}
