/**
 * 
 */
package com.chenxuanxi.javase.review;

/**
 * @author Daniel Chan
 *
 */
public class Triangle {
	
	private int Wide ;
	private int High ;
	
	public double getArea(){
		return Wide*High*0.5;
	}
	
	public Triangle(int a , int b ){
		this.Wide=a;
		this.High=b;
	}
	
	public static void main(String[] args){
		Triangle area = new Triangle(4,6);
		System.out.println(area.getArea());
		
		
	}
	
}
