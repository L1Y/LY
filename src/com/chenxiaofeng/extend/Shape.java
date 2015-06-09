package com.chenxiaofeng.extend;

public abstract class Shape {
	protected String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name=n;
	}
	
	public abstract double getArea();

}
