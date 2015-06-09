package com.liduan.javase.inherit;

public class Cube extends Square{
	private double depth;
	
	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public Cube(){
		super();
	}
	
	//���췽��������
	public Cube(double width, double height){
		super(width, height);
	}
	
	public Cube(double width, double height, String name){
		super(width, height, name);
	}
	
	public Cube(double width, double height, double depth, String name){
		super(width, height, name);
		setDepth(depth);
	}
	
	/**
	 * ��ȡ��������
	 * @return
	 */
	public double getVolume(){
		return getWidth() * getHeight() * getDepth();
	}
}
