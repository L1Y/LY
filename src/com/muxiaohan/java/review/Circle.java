package com.muxiaohan.java.review;

public class Circle {
	private int r;
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	private double pi = 3.14;
	 
	public double getArea(){
		return pi*r*r;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setR(5);
		System.out.println(c.getArea());
	}

}
