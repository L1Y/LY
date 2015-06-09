package com.wangzexin.javase.review;

public class Square {
    private int height;
    private int width;
    
    public int getArea(){
        return height * width;
    }
    
    /*
    public static void main(String[] args){
        Square square = new Square();
        System.out.println("The area of square is "+square.getArea());
    }
    */
    
    public Square(){
        height = 15;
        width = 20;
    }
    
    public Square(int argHeight , int argWidth){
        height = argHeight;
        width = argWidth;
    }
}
