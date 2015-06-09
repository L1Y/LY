package com.liduan.javase.review;

public class Circle {
	private double r;
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.circle(5));
	}
	private double circle(double r){
		this.r=r;
		return 3.14*r*r;
	}

}
