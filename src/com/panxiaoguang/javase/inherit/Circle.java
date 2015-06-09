package com.panxiaoguang.javase.inherit;

public class Circle {
	private double r;
	final double pi=3.14;
	
	public Circle(){
		
	} 
	
	public Circle(double r){
		this.r=r;
	}
	
	public double getR(double r){
		return r;
	}
    
	public void setR(){
		
	}
	
	public double getArea(){
		return pi * r * r;
	}
}
