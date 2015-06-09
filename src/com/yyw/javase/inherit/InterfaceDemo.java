package com.yyw.javase.inherit;

public class InterfaceDemo {
	
	public static void main(String[] args){
		
	}
	
}
/*
 *    语法：interface 接口名称{}所有方法都不能实现
        1，接口当中常见的成员，而且这些成员都有固定的修饰符
            1，全局常量：public static final，所有属性
            2，抽象方法：public abstract，所有方法都是
            5，抽象类一定是父类吗？
                是的。
            可理解成特殊的抽象类
 */

interface Switch{
	public static int NUM = 10;
	public abstract void open();
	float PI = (float)3.14;
	void close();
}