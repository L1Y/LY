package com.yyw.javase.inherit;

/**
 * 
 * @author YP
 *
 *语法：
 *	变量：修饰符static 
 *		全局变量
 *		被static修饰的方法叫类方法
 *		static的方法不能被重写,重名的函数算两个函数，使用类名调用
 */

public class StaticDemo {
	public static void main(String[] args){
		System.out.println(En.j);
		Fn f = new Fn();
		Fn.add(9);
		En.add(8);
	}
	
	public static void change(){
		En.j++;
		System.out.println(En.j);
	}
}

class En{
	static int j = 10;
	
	static void show(){
		System.out.println(En.j);
	}
	
	static void add(int i){
		System.out.println("add" + i);
	}
}

class Fn extends En{
	//@Override   加上这个就错误，编译是重写的步骤错误
	public static void add(int i){
		System.out.println("addF" + i);
	}
}