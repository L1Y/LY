package com.liduan.javase.inherit;

public class FinalDemo {
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	}

}

//���౻final���ε�ʱ���޷����̳�
/*final*/ class A{
	//���Ʊ����д������Ƕ�����ʣ��á�_���»������ָ�
	public final double PI = 3.14d;
	
	//��������final���ε�ʱ���޷��������и���
	final void showA(){
		//PI = 3.0;
		
	}
	
	int r = 1;
	void getArea(){
		double result = r * r * 3.14;
	}
}

class B extends A{
	void showB(){
		
	}
	
//	void showA(){
//		
//	}
}
