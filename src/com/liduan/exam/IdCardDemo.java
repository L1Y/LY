package com.liduan.exam;

public class IdCardDemo {

	public static void main(String[] args) {
		String str = "34052419800101001X";
		IdCardDemo demo = new IdCardDemo();
		System.out.println("身份证号码为" + str + "经过验证的结果是" + demo.isValidId(str));
	}
	
	public boolean isValidId(String str){
		int[] coefficients = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
		//System.out.println(coefficients.length);
		String[] remainders = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		int sum = 0;//和
		char[] array = str.toCharArray();
		int len = array.length;
		for(int i = 0; i < len - 1; i++){
			char item = array[i];
			int value = item - 48;
//			System.out.println(value);
			
			sum += value * coefficients[i];
		}
		
		int redundant = sum % 11;//得到余数
		String idEndStr = remainders[redundant]; 
		
		char idEndChar = array[len - 1];
		
		if(idEndStr.charAt(0) == idEndChar){
			return true;
		}
		
		return false;
	}

}
