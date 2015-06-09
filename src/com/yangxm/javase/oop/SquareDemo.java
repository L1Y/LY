package com.yangxm.javase.oop;


public class SquareDemo {

	public static void main(String[] args) {
		Square square=new Square();
		
		square.setWeigth(20);//用引用类型的变量square去访问属性
		System.out.println("矩形的宽为："+square.getWeigth());
		
		square.setHeigth(15);
		System.out.println("矩形的高为："+square.getHeigth());
		
		double area=square.getArea(15,20);
		System.out.println("矩形面积为："+area);

	}
}
