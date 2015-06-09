package com.muxiaohan.java.review;

public class Triangle {
	private int hight;
	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	private int width;
	
	
	public int getArea(){
		return width*hight/2;
	}
	public static void main(String[] args) {
		Triangle tan = new Triangle();
		tan.setHight(10);
		tan.setWidth(20);
		int result = tan.getArea();
		System.out.println(result);
		//带参构造
		int result2 = tan.getArea(20,12);
		System.out.println(result2);
		
	}

	private int getArea(int i, int j) {
		// TODO Auto-generated method stub
		this.width = i ;
		this.hight = j;
		return width*hight;
	}

}
