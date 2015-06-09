package com.zhenshuyu.javase.review;


public class Triangle {
	private double di;
	private double gao;

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.triangle(10.0, 5.0));

	}
	public double triangle(double d, double g){
		di=d;
		gao=g;
		return di*gao/2;
	}
 
}
