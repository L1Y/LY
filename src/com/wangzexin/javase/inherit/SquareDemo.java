package com.wangzexin.javase.inherit;

public class SquareDemo {
    
    public static void main(String args[]){
        Square square = new Square(10,10,"rectangle");
        System.out.println("The area of " +square.getName() +" is "+ square.getArea());
        
        SquareInherit squareIn = new SquareInherit(12,32,"square");
        System.out.println("The area of " +squareIn.getName() +" is "+ squareIn.getArea());
    }

}
