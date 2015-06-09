package com.wangzexin.javase.inherit;

public class SquareInherit extends Shape{
    
    public SquareInherit(double width, double height){
        super(width , height);
    }
    
    public SquareInherit(double width, double height, String name){
        super(width , height , name);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getWidth() * getHeight();
    }
    
    
    
//    public double getArea(){
//        return getWidth() * getHeight();
//    }
}
