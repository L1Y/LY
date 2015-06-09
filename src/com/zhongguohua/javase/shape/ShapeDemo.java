package com.zhongguohua.javase.shape;

public class ShapeDemo {
	public static void main(String[] args){
		Square sq = new Square();
		Triangle tr = new Triangle();
		System.out.print("Area is :::" + sq.getArea(10,15));
		System.out.print("Area is :::" + tr.getArea(10,15));
	}
}
