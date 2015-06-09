/**
 * 
 */
package com.chenxuanxi.javase.review;

/**
 * @author Daniel Chan
 *
 */
public class Circle {
	private int R ;
	private double Cir;
	
	public double getArea(){
		return R*Cir ;
	}
	
	public Circle(int a , double b){
		this.R = a ;
		this.Cir = b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle area = new Circle(4,3.14);
		System.out.println(area.getArea());
	}

}
