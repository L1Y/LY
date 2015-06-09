package com.lupeifa.javase.inherit;

public class Circle {
	private double r;
	final double PI=3.14;
	
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
		return PI * r * r;
	}
}
