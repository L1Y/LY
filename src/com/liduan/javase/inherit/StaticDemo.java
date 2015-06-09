package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *
 *	�﷨��
 *		���������η� static �������� �������ơ�
 *			��һ�����Ա�static�ؼ������ε�ʱ��
 *			��ô�����Ծͽ��������ԣ�ͬʱ��ֻ��һ���ڴ�飬����new���ٸ������ʵ������static���ε����Զ�ֻ��һ���ڴ��ַ
 *		���������η� static ����ֵ���� ��������
 *			��һ��������static�ؼ������ε�ʱ��
 *			��ô�÷����ͽ����෽����static�������޷�����д��
 */
public class StaticDemo {

	public static void main(String[] args) {
//		E e = new E();
////		System.out.println(e.j);
//		System.out.println(E.j);
////		e.show();
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
	public static int j = 2;
	
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
	//@Override
	public static void add(int i){
		E.add(i);
		System.out.println("����д��add" + i);
	}
}
