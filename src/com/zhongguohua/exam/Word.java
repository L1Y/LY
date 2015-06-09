package com.zhongguohua.exam;

import java.util.Scanner;

public class Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String inString = sc.next();
		System.out.print("请输入要转行的位置：");
		int x = sc.nextInt();
		System.out.print(valign(inString,x));
	}
	public static String valign(String str,int pos){
		String temp = null;
		String temp1 = null;
		String temp2 = null;
		temp1 = str.substring(0, pos);
		temp2 = str.substring(pos, str.length());
		temp = temp1.concat(new String("\n"));
		for(int i = str.length()-1; i >= pos ;i--){
			temp =temp +  str.valueOf(str.charAt(i));
		}
		return temp;
		}
}
