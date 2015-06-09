package com.yyw.javase.inherit;

class Fu{
	int num;
	Fu(){
		show();
		//super.show();
		System.out.println("FU..." + num);
	}
	void show(){
		System.out.println("fu show..." + num);
	}
}

class Zi extends Fu{
	//const int num1 = 6;
	int num = 6;
	Zi(){
		num = 10;
		show();
	}
	void show(){
		System.out.println("zi show..." + num);
	}
}

public class Test {
	public static void main(String[] args){
		Zi z=new Zi();
		z.show();
	}
}
