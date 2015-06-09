package com.yyw.javase.inherit;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Animal cat01 = new Cat();//����è�������Լ�������
		method(cat01);
		((Cat)cat01).catchMouse();//catchMouseһ���cat01͸����ֻ��ǿ���ҵ�

		Animal cat00 = new WhiteCat();
		method(cat00);
		
		//WhiteCat cat2 = (WhiteCat)new Cat();//����ת������
		
		Cat cat = new WhiteCat();
		WhiteCat cat1 = (WhiteCat) cat;
		cat1.eat();
		//System.out.println(cat);
		//System.out.println(cat1);
		//cat.eat();
		//method(cat);
		System.out.println(cat instanceof Cat);
		
		Animal wc = new WhiteCat();
		((Cat)wc).eat();    //eat�Ѿ���WhiteCat���eat��д
		
	}

	public static void method(Animal ani){
		ani.eat();
	}
}

abstract class Animal{
	public abstract void eat();
}

class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("eat fish!");
		
	}
	
	public void catchMouse(){
		System.out.println("catch mouse");
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("eat boon");		
	}
	
}

class WhiteCat extends Cat{
	
	@Override
	public void eat(){
		System.out.println("��è��");
	}
}