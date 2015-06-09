package com.yangxm.javase.abstrac;

public class Square extends Shape{
	//构造方法的重载
		public Square(double width, double height){
			super(width, height);
		}
		
		public Square(double width, double height, String name){
			super(width, height, name);
		}
		
		@Override
		public double getArea(){
			return getWidth() * getHeight();
		}
		
		//重写
		@Override
		public String toString(){
			return super.toString();
		}
}
