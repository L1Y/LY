package com.zouyuejian.javase.wrapperclass;

public class DoubleDemo {
	public static void main(String[] args) {
		double d1 = 1.2;
		Double d2 = new Double(d1);
		String str = "NaN";
		Double d3 = new Double(str);
		System.out.println(d3.isNaN());
		System.out.println(d2.isNaN());
		int a = (int)Math.random()*5;
		char c1 = '9';
		char c2 = '\u216c';
		int b = Character.getNumericValue(c1);
		System.out.println(Character.getNumericValue(c2));
		System.out.println(c2);
		System.out.println(b);
		//System.arraycopy(src, srcPos, dest, destPos, length);
	}
}
