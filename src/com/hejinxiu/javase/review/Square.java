package com.hejinxiu.javase.review;

public class Square {

	private int hight;
	private int wide;

	public int getArea() {
		int Area = hight * wide;

		return Area;
	}

	public static void main(String[] args) {

		Square c1 = new Square();
		c1.hight = 15;
		c1.wide = 20;

		System.out.println(c1.getArea());

	}

	public Square() {
		wide = 15;
		hight = 20;
	}

	public Square(int w, int h) {
		wide = w;
		hight = h;
	}

	class Roundness extends Square {

		private double radius;
		public double getArea1()
		{
			double area = 3.14*radius*radius;
			return area;
		}
		public Roundness(){
			
		}
		Roundness(double radius){
			this.radius=radius;
		}

	}

}
