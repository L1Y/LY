package com.chenxiaofeng.review;

public class SquareDemo {

	public static void main(String[] args){
		int height=15,width=20;
		Square sq=new Square(height,width);
		System.out.println("��Ϊ"+height+"����Ϊ"+width+"�ľ��ε����Ϊ��"+sq.publicGetArea());
	}

}
