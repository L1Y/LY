package com.chenshengli.javase.review;

public class Square {

	private int high;
	private int wide;
	
	public Square(){
		high = 15;
		wide = 20;
	}
	
	
	public Square(int high, int wide){
		this.high = high;
		this.wide = wide;
		System.out.println("矩形的面积为：" + high * wide);
	}
	
	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public int getArea(){
		int area = high * wide;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
