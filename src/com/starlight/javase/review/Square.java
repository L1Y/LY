package com.starlight.javase.review;


public class Square extends Shape {
	protected double hight = 0;
	protected double width = 0;
	protected String name;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Square square = new Square(25 , 20);
		System.out.print(square.getArea( square.hight , square.width ));	

	}
	

	Square(int h, int w){
		hight = h;
		width = w;
	}
	
	Square(String nstr, int h , int w){
	      name = nstr;
	      hight = h;
	      width = w;
	}
	
	public double getArea(double h , double w){
		double s = 0;
		s = h * w;
		return s;
	}
	
	public double getHight(){
	      return hight;
	}
	
	public void setHight(){
	      
	}
	
	public double getArea(){
          return this.getHight() * this.getWidth();
	}
	


}
