package com.liduan.javase.review;


public class Square {
	private double width;//��
	private double height;//��
	private String name;
	/**
	 * ��ȡ���
	 * @return
	 */
	public double getArea(){
		return width * height;
	}
	public double getArea(double width,double height ){
		this.width=width;
		this.height=height;
		return width*height;
	}
	public double getWidth(){
		return width;
	}
	public double getHeith(){
		return height;
	}
	public static void main(String[] arg){
		Square square = new Square();
		square.width = 15;
		square.height = 20;
		System.out.println(square.getArea());
		
		int w = 15;
		int h = 20;
		Square square1 = new Square(w, h);
		System.out.println(square1.getArea());
	}
	
	public Square(){
		width = 15;
		height = 20;
	}
	
	public Square(int w, int h){
		width = w;
		height = h;
	}

}
