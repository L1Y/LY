package com.lupeifa.javase.inherit;



public class SquareDemo {
	public static void main (String arg[]){
		Square square =new Square(10,10);
		System.out.println(square.getArea());
		System.out.println(square);
	
		
		Triangle triangle =new Triangle(10,10);
		System.out.println(triangle.getArea());
		System.out.println(triangle);
		
		Circle circle =new Circle(10);
		System.out.println(circle.getArea());
		System.out.println(circle);

	
	    String str = "Hello";
	    SquareDemo sd = new SquareDemo();
	    System.out.println(str);
	    System.out.println(sd.change(str));
}



public String change(String str){
	str = str + "我已经被改变了";
	
	return str;
}
}
