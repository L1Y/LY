package com.liduan.javase.calculator;

import java.util.Arrays;

public class CalculatorDemo4 {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		
		String str = "1+2*6/3-5";
		String[] params = str.split("\\+|\\*|/|-");
		System.out.println(Arrays.toString(params));
		
		char[] arrayStr = str.toCharArray();
		int lenStr = arrayStr.length;
		int[] markIndex = new int[lenStr];
		for(int i = 0; i < lenStr; i++){
			char item = arrayStr[i];
			if(item == '*' || item == '/'){
				markIndex[i] = i;
			}
		}
		
//		Algorithm al = new Algorithm();
//		al.doBubbleSortByDesc(markIndex);
		System.out.println(Arrays.toString(markIndex));
		
	}
}
