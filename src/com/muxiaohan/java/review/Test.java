package com.muxiaohan.java.review;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.valueOf("123").intValue();//����;��з����������ˡ�
		int b = Integer.parseInt("123");
		System.out.println(a);
		System.out.println(b);
		
		String name = "Ľ�к�";
		char n = name.charAt(2);
		String number = "abc";
		int m = number.codePointAt(0);//codePointAt():����ָ�����������ַ���Unicode����㣩
		System.out.print(n+""+m);
		
		
	}

}
