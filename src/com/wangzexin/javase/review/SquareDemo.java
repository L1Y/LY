package com.wangzexin.javase.review;

public class SquareDemo {
    
    private static final String TAG = SquareDemo.class.getSimpleName();
    
    public static void main(String[] args){
        
        Square square0 = new Square();
        System.out.println("The area of Square0 is "+square0.getArea());
        
        Square square1 = new Square(25,20);
        System.out.println("The area of Square1 is "+square1.getArea());
        
        Square square2 = new Square(30,30);
        System.out.println(TAG+"=="+square2.getArea());
        
    }
}
