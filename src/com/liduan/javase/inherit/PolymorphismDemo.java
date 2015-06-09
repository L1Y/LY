package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *
 *	��̬��������̬
 *
 */
public class PolymorphismDemo {
	public static void main(String[] args){
		Cat cat = new Cat();
		//method(cat);
		//((Dog)cat).lookHouse();//��ȷ�����������ͣ����Ա����ʱ����ʾ���޷�ת������
		
		Dog dog = new Dog();
		//method(dog);
		
		Horse horse = new Horse();
		//method(horse);
		
		//�Զ��������ͣ�רҵһ���˵�����ǣ�����ת��
		Animal cat1 = new Cat();
		//method(cat1);
		//((Cat)cat1).catchMouse();//ע�⣺���ڶ�̬�е�ת�ͣ���ֻ��������������仯
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
		/*�׶ˣ��޷�ʹ������ �е����з���
		 *�ŵ㣺�����������з��������Ʒ���
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
		System.out.println("����");
	}

	@Override
	public void sleep() {
		System.out.println("è��˯");
	}
	
	public void catchMouse(){
		System.out.println("ץ����");
	}
	
}

class FamilyCat extends Cat{
	public void kitty(){
		System.out.println("����");
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("�й�ͷ");
	}

	@Override
	public void sleep() {
		System.out.println("����˯");
	}
	
	public void lookHouse(){
		System.out.println("����");
	}
	
}

class Horse extends Animal{

	@Override
	public void eat() {
		System.out.println("�Բ�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
