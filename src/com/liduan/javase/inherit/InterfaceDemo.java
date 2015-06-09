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
 * 接口所有方法都是无法实现的。可以当作一个特殊的抽象类
 * 
 * 语法：interface 接口名称{}
 * 
 * 接口只有全局常量和public abstract的方法
 * 也就是接口中所有方法都是public abstract修饰的
 * 所有属性都是public static final修饰
 * */

interface Switch{
	public static final int NUM = 10;
	public abstract void open();
	public abstract void close();
}

interface G{
	public abstract void show();
}
