package com.liduan.javase.oop;

//���class��public���εĻ����ͱ����java�ļ�������һ��
//һ��������ֻ����һ��class��public����
/**
 * 
 * @author Leo
 *	����һ�������࣬���м�������ķ���
 */
public class Square {
	//����һ�����ԣ����η� ���� ��������
	private double width;
	double height;
	private String name;
	
	/**
	 * ���췽��
	 * 1���������������ͬ��
	 * 2������û�з���ֵ
	 * @param width
	 */
	public Square(){
		
	}
	
	//���췽��������
	public Square(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Square(double width, double height, String name){
		this(width, height);
		this.name = name;
	}
	
	public Square(String name, double width, double height){
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getArea(double width, double height){
		this.width = width;
		this.height = height;
		
		return getArea();
	}
	
//	//���������ظ�����ֵû�й�ϵ
//	public int getArea(double width, double height){
//		return 0;
//	}
	
	//����һ��set����
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		height = 16;//��ʾֵ����
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
