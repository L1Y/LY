package com.muxiaohan.java.review;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.valueOf("123").intValue();//对象就具有方法和属性了。
		int b = Integer.parseInt("123");
		System.out.println(a);
		System.out.println(b);
		
		String name = "慕逍寒";
		char n = name.charAt(2);
		String number = "abc";
		int m = number.codePointAt(0);//codePointAt():返回指定索引处的字符（Unicode代码点）
		System.out.print(n+""+m);
		
		
	}

}
