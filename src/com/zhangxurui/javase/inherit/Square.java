package com.zhangxurui.javase.inherit;

public class Square extends Shape {
	
		public double getArea(){
			return 0;
		}
		
		public double getArea(double width,double height){
			return width * height;
		}
		
		public static void main(String [] args){
			Square square = new Square();
			double area = square.getArea(1.5, 2.0);
			Square triangle = new Square();
			String str ="triangle";
			triangle.setName(str);
			triangle.getName();
			double a = 0 ;
			a = triangle.getArea(1.5, 2.0, triangle.getName());
			System.out.println(area);
			System.out.println(a);
		}
}
