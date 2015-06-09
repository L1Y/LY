package com.liduan.javase.javalang;

public class CharacterDemo {
	public static void main(String[] args){
		char c1 = '9';
		char c2 = '\u4eec';
		Character c = new Character(c1);
		Character c3 = new Character(c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Character.getNumericValue(c1));
		System.out.println(Character.getNumericValue(c2));
		System.out.println(c3.toString());
	}
}
