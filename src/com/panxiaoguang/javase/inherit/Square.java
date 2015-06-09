package com.panxiaoguang.javase.inherit;

/*public class Square {
	private String name;
	private double width;
	private double height;
	
	public Square(){
		//width=15;
		//height=15;
	}
	
    public Square(double width,double height){
		this.height=height;
		this.width=width;
		//width=15;
		//height=15;
	}
	
    public Square(double width,double height,String name){
		this(width, height);
		this.name = name;
	}
	
	public void setWidth(double width){
		this.width=width;	
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getWidth(){
		return width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}*/
 public class Square extends Shape{
		public Square(){
			super();
		}
		
		
		public Square(double width, double height){
			super(width, height);
		}
		
		public Square(double width, double height, String name){
			super(width, height, name);
		}
		
		public double getArea(){
			return getWidth() * getHeight();
		}
		
	}

