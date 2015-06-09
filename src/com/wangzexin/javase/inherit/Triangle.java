package com.wangzexin.javase.inherit;

public class Triangle extends Shape{
    
    @Override
    public double getArea(){
        return getWidth() * getHeight() /2;
    }
}
