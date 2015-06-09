package com.fengdi.javase.review;

public class Square {
	private double width;
	private double height;
	private String name ;
	public static void main(String[] args) {
		Square s = new Square(15, 20,"¾ØÐÎ");
		System.out.println(s.getAren(15, 20));
	}

	public Square(double a, double b , String c) {
		width = a;
		height = b;
		name  = c ;
	}

	public double getAren(double a, double b) {

		return  a* b;
	}

}
