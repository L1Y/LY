/**
 * 
 */
package com.chenxuanxi.javase.review;

import java.util.Scanner;

/**
 * @author Daniel Chan
 *
 */
public class Square {
	
	private String name ;
	private double Length ;
	private double Wide ; 
	
	public double getArea(){
		return Length * Wide;
	}
			
	
	public Square(double w, double h,String k){
		this.Length = w;
		this.Wide =h ;
		this.name=k ;
	}


	public double getLength() {
		return Length;
	}


	public void setLength(double Length) {
		this.Length = Length;
	}
	
	public double getWide(){
		return Wide;
	}
	
	public void setWide(double Wide){
		this.Wide = Wide;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}


