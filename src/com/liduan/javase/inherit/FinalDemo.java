package com.liduan.javase.inherit;

public class FinalDemo {
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	}

}

//当类被final修饰的时候，无法被继承
/*final*/ class A{
	//名称必须大写，如果是多个单词，用“_”下划线来分隔
	public final double PI = 3.14d;
	
	//当方法被final修饰的时候，无法在子类中覆盖
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
