package com.yangxm.javase.oop;


public class SquareDemo {

	public static void main(String[] args) {
		Square square=new Square();
		
		square.setWeigth(20);//���������͵ı���squareȥ��������
		System.out.println("���εĿ�Ϊ��"+square.getWeigth());
		
		square.setHeigth(15);
		System.out.println("���εĸ�Ϊ��"+square.getHeigth());
		
		double area=square.getArea(15,20);
		System.out.println("�������Ϊ��"+area);

	}
}
