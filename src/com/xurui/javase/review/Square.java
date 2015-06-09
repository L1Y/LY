package com.xurui.javase.review;

public class Square {
	private int width;
	private int height;
	/**
	 * ¼ÆËãÃæ»ı
	 */
	public int getArea(){
		return width * height;
	}
	
	public static void main(String[] args){
		Square rectangle = new Square();
		rectangle.width = 15;
		rectangle.height = 20;
		System.out.println(rectangle.getArea());
		
		//int w =15;
		//int h = 20;
		
	}
	public Square(){
		width = 15;
		height =20;
	}
	public Square(int w,int h){
		width = w;
		height = h;
	}

}
