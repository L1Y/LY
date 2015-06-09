package com.guzhijie.javase.shape;

	public class Square {
		  private double height;
		  private double width;
		  private String name;  
		   
		  public void setHeight(double height){
			  this.height = height;
		  }
		  public double getHeight(){
			  return height;
		  }
		  
		  public void setWidth(double width){
			  this.width = width;
		  }
		  public double getWidth(){
			  return width;
		  }
		  
		  public void setName(String name){
			  this.name =name;
		  }
		  
		  public String getName(){
			  return name;
		  }
		  
		  
		  
		  public Square(){
		    	width = 15;
		    	height = 20;
		    }
		    
		    public Square(double height, double width){
		    	this.width = width;
		    	this.height = height;
		    }
		    
		    public Square(double height, double width, String name){
		    	this(height, width);
		    	this.name = name;
		    }
		    
		    public double getArea(){
		    	return height * width ;
		    }	
		    
		    public double getArea(double height, double width){
		    	this.height = height;
		    	this.width = width;
		    	return width * height;
		    }

		   

		}
