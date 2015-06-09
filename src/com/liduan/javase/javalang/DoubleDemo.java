package com.liduan.javase.javalang;

public class DoubleDemo {

	public static void main(String[] args) {
		try {
			String str = "NaN";
			double d1 = 1.0d;
			Double d2 = new Double(d1);
			Double d = new Double(str);
			//NaNÊÇNot-a-NumberµÄËõÐ´
			System.out.println(Double.isNaN(Math.pow(Math.sqrt(-1), 2)));
			System.out.println(Double.isNaN(Math.sqrt(-1) * Math.sqrt(-1)));
			System.out.println(Double.isNaN(1/0.0));
			System.out.println(d.isNaN());
			System.out.println(d2.isNaN());
			System.out.println("d2 long value " + d2.longValue());
			System.out.println("d2 short value " + d2.shortValue());
			System.out.println("d2 byte value " + d2.byteValue());
			System.out.println("d2 int value " + d2.intValue());
			System.out.println("d2 float value " + d2.floatValue());
			System.out.println("d2 hex value " + d2.toHexString(d2));
			System.out.println("d2 string value " + d2.toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
