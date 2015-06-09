package com.wangzexin.javase.inherit;

public class Square {
    private double width;
    private double height;
    private String name;
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String  getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Square(){
        width = 0;
        height = 0;
        name = null;
    }
    
    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public Square(double width, double height, String name){
        this(width,height);
        this.name = name;
    }
    
    public double getArea(double width, double height){
        this.width = width;
        this.height = height;
        
        return width * height;
    }
    
    public double getArea(){
        return width * height ;
    }
}
