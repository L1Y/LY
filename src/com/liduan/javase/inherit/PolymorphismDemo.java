package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *
 *	多态：多种形态
 *
 */
public class PolymorphismDemo {
	public static void main(String[] args){
		Cat cat = new Cat();
		//method(cat);
		//((Dog)cat).lookHouse();//明确了是子类类型，所以编译的时候提示，无法转换类型
		
		Dog dog = new Dog();
		//method(dog);
		
		Horse horse = new Horse();
		//method(horse);
		
		//自动提升类型，专业一点的说法就是：向上转型
		Animal cat1 = new Cat();
		//method(cat1);
		//((Cat)cat1).catchMouse();//注意：对于多态中的转型，都只是子类对象在做变化
		((Dog)cat1).lookHouse();//java.lang.ClassCastException:
		
//		Cat cat2 = (Cat)new Animal();
		FamilyCat fc = (FamilyCat)new Cat();
		method(fc);
		
		Animal fc1 = new FamilyCat();
		//method(fc1);
		((FamilyCat)fc1).kitty();
	}
	
	/*public static void method(Cat cat){
		cat.eat();
	}
	
	public static void method(Dog dog){
		dog.eat();
	}*/
	
	public static void method(Animal ani){
		ani.eat();
		ani.sleep();
		/*弊端：无法使用子类 中的特有方法
		 *优点：对子类中特有方法做限制访问
		 *ani.catchMouse(); 
		 */
		
	}
}

abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
}

class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("猫在睡");
	}
	
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
	
}

class FamilyCat extends Cat{
	public void kitty(){
		System.out.println("卖萌");
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("啃骨头");
	}

	@Override
	public void sleep() {
		System.out.println("狗在睡");
	}
	
	public void lookHouse(){
		System.out.println("看家");
	}
	
}

class Horse extends Animal{

	@Override
	public void eat() {
		System.out.println("吃草");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
