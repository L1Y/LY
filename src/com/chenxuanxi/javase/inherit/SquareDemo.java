package com.chenxuanxi.javase.inherit;

public class SquareDemo {
	public static void main(String[] args){
		Square square = new Square(10, 10);
		System.out.println(square.getArea());
		System.out.println(square);
		
		Cube cube = new Cube(10, 20, 10, "cube");
		System.out.println("volume is " + cube.getVolume());
		System.out.println("area is " + cube.getArea());
		
		String str = "Hello";
		SquareDemo sd = new SquareDemo();
		sd.print(str);
		sd.print(sd.change(str));
	}
	
	public void print(String str){
		System.out.println(str.hashCode());
		System.out.println(Integer.toHexString(str.hashCode()));
	}
	
	public String change(String str){
		str = str + "我已经被改变了";
		
		return str;
	}
}
