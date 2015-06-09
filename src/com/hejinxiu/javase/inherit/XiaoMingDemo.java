package com.hejinxiu.javase.inherit;

public class XiaoMingDemo {

	public static void main(String[] args){
		XiaoMing s1 = new XiaoMing("何锦绣","男",18,"441226199302191****",456478,"机械","机械123","广州大学");
		
		System.out.println(s1.getName());
		/**
		 * 打印一个对象，必经一个toString的方法
		 */
		System.out.println(s1);
	}
}
