package com.chenxiaofeng.review;

public class SquareDemo {

	public static void main(String[] args){
		int height=15,width=20;
		Square sq=new Square(height,width);
		System.out.println("高为"+height+"，宽为"+width+"的矩形的面积为："+sq.publicGetArea());
	}

}
