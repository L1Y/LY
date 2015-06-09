package com.yangxm.javase.oop;

public class Square {
	private double weigth;
	private double heigth;
	private String name;
	

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public String getName(){
		return name;
	}
	public void setNane(String name){
		this.name = name;
	}
	
	public Square(){
		
	}
	public Square(double weigth,double heigth){
		this.weigth = weigth;
		this.heigth = heigth;
	}
	public Square(double weigth,double heigth,String name){
		this(weigth, heigth);
		this.name = name;
	}
	public double getArea(){
		return weigth * heigth;
	}
	
	public double getArea(double weigth,double heigth){
		this.weigth = weigth;
		this.heigth = heigth;
		return weigth * heigth;
	}

}
