package com.yyw.javase.inherit;

/**
 * 
 * @author YP
 *
 *�﷨��
 *	���������η�static 
 *		ȫ�ֱ���
 *		��static���εķ������෽��
 *		static�ķ������ܱ���д,�����ĺ���������������ʹ����������
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
	//@Override   ��������ʹ��󣬱�������д�Ĳ������
	public static void add(int i){
		System.out.println("addF" + i);
	}
}