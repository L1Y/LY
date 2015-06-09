package com.chenxiaofeng.review;

public class Square {
	private int height;
	private int width;
	
	public Square(){}
	
	public Square(int h,int w){
		height=h;
		width=w;
	}
	
	private int getArea(){
		return height*width;
	}
	
	public int publicGetArea(){
		return getArea();
		/* -------方案2---------
		 * return height*width;
		 */
	}
	
	public static void main(String[] args){
		int height=15,width=20;
		Square sq=new Square(height,width);
		System.out.println("高为"+height+"，宽为"+width+"的矩形的面积为："+sq.getArea());
	}
	
}
