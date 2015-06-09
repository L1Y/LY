package com.liduan.javase.thread;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 和s2是否一样：" + (s1.equals(s2) ? "是" : "否"));
		System.out.println("s1 和s2是否一样：" + (s1 == s2 ? "是" : "否"));
		/*
		 * ==和equals的区别
		 * 1，基本数据类型之间只能用==来比较，且都是对数值进行比较
		 * 2，复合类型(类)之间用==或者equals进行比较大部分都是进行地址比较，
		 * 除了String和基本数据类型的包装器类等重写过equals方法的类就是内容之间的比较
		 * */
	}

}

class Singleton{
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			System.out.println("Singleton.class:::" + Singleton.class);
			synchronized(Singleton.class){
				instance = new Singleton();
			}
		}
		
		return instance;
	}
}
