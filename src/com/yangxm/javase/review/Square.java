package com.yangxm.javase.review;

public class Square {
	private int weigth;
	private int heigth;
	

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	private int getArea(int g,int k){
		int area=g*k;
		return area;
	}

	public static void main(String[] args) {
		Square square=new Square();
		
		square.setWeigth(20);//���������͵ı���squareȥ��������
		System.out.println("���εĿ�Ϊ��"+square.getWeigth());
		
		square.setHeigth(15);
		System.out.println("���εĸ�Ϊ��"+square.getHeigth());
		
		int area=square.getArea(15,20);
		System.out.println("�������Ϊ��"+area);

	}
}
