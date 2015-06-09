package com.yyw.javase.inherit;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Animal cat01 = new Cat();//它是猫，它把自己当动物
		method(cat01);
		((Cat)cat01).catchMouse();//catchMouse一般对cat01透明，只能强制找到

		Animal cat00 = new WhiteCat();
		method(cat00);
		
		//WhiteCat cat2 = (WhiteCat)new Cat();//类型转换错误
		
		Cat cat = new WhiteCat();
		WhiteCat cat1 = (WhiteCat) cat;
		cat1.eat();
		//System.out.println(cat);
		//System.out.println(cat1);
		//cat.eat();
		//method(cat);
		System.out.println(cat instanceof Cat);
		
		Animal wc = new WhiteCat();
		((Cat)wc).eat();    //eat已经被WhiteCat类的eat重写
		
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
		System.out.println("吃猫粮");
	}
}