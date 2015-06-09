package com.zhongguohua.exam;

import java.util.Scanner;

public class idCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入身份证号码：");
		String idString = sc.next();
		if(isValidId(idString)){
			System.out.print("合格");
		}
		else{
			System.out.print("不合格");
		}
	}
	
	public static boolean isValidId(String str){
		int sum = 0;
		int x = 0;
		String idLast = "10X98765432";
		String numString = "68947310526894731";
		for(int i = 0; i<=str.length()-2;i++){
			sum =sum +( Character.digit(numString.charAt(i), 10) + 1)*  Character.digit(str.charAt(i), 10);
		}
		x = sum%11;
		if(idLast.charAt(x) == str.charAt(17)){
			return true;
		}
		else{
			return false;
		}
	}
}
