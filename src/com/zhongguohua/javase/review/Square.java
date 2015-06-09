package com.zhongguohua.javase.review;

public class Square {
	private int width;
	private int height;
	
	public int getArea(){
		return width * height;
	}
	
	public static void main(String[] args){
		Square square = new Square();
			square.width = 15;
			square.height = 20;
		System.out.print(square.getArea());
		
		int w = 15;
		int h = 20;
		Square square1 = new Square(w,h);
		System.out.print(square1.getArea());
	}
	
	public Square(){
		width = 15;
		height = 20;
	}
	public Square(int w,int h){
		width = w;
		height = h;
	}
}
