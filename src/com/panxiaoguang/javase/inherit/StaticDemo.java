package com.panxiaoguang.javase.inherit;

/**
 * 
 * @author shmily
 *
 *语法：
 *     变量：修饰符static 变量类型变量名称。当一个属性被static关键字修饰的时候，
 *          那么该属性就叫做类属性，同事该只有一个内存块，不管new多少个该类的实例，被static修饰的属性都只有一个内存地址
 *     方法：修饰符static 返回值类型 方法名称
 *          当一个方法被static 关键字修饰的时候，
 *          那么该方法就叫做类方法。static 方法是无法被重写的     
 */

public class StaticDemo {
	
	public static void main(String[] args) {
//		E e = new E();
//		    System.out.println(e.j);
//		System.out.println(E.j);
//		    e.show();
//		StaticDemo.change();
//		e.show();
		F f = new F();
		f.add(3);
		F.add(4);
	}
	
	static void change(){
		E.j++;
	}

}

class E{
	private int i = 0;
	public  static int j = 2;
	
	public E(){
		add(1);
	}
	
	void show(){
		System.out.println(E.j);
	}
	
	public static void add(int i){
		System.out.println("add" + i);
	}
}

class F extends E{
	public static void add(int i){
		E.add(i);
		System.out.println("被重写的add" + i);
	}
}
