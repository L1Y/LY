package com.liduan.javase.inherit;

public class InterfaceDemo implements Switch, G{

	public static void main(String[] args) {
		System.out.println(Switch.NUM);
//		Switch.NUM = 20;
	}

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void show() {
		
	}

}

/*
 * �ӿ����з��������޷�ʵ�ֵġ����Ե���һ������ĳ�����
 * 
 * �﷨��interface �ӿ�����{}
 * 
 * �ӿ�ֻ��ȫ�ֳ�����public abstract�ķ���
 * Ҳ���ǽӿ������з�������public abstract���ε�
 * �������Զ���public static final����
 * */

interface Switch{
	public static final int NUM = 10;
	public abstract void open();
	public abstract void close();
}

interface G{
	public abstract void show();
}
