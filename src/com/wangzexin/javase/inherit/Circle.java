package com.wangzexin.javase.inherit;

public class Circle {
    private double radius;
    private final double pi = 3.14;
    private String name;
        
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String  getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Circle(){
        radius = 0;
        name = null;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String name){
        this(radius);
        this.name = name;
    }
    
    public double getArea(double radius){
        this.radius = radius;
        return pi * radius * radius;
    }
    
    public double getArea(){
        return pi * radius * radius;
    }
}
