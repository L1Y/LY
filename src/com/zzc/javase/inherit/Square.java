package com.zzc.javase.inherit;

public class Square extends Shape{
	
	public static void main(String args[]){
		Square square = new Square(3.0,7.0,"长方形");
		System.out.println(square.getName() + square.getArea());
	}
	
	public Square(){
		
	}
	
	public Square(double height, double width){
		super(height,width);
	}
	
	public Square(double height, double width, String name){
		super(name,height,width);
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return getHeight() * getWidth();
	}
	
}
