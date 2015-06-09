package com.zzc.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo3 {
	public static void main(String args[]){
		Calculator cal = new Calculator();
		
		boolean hasSetX = false;//�Ƿ��Ѿ�����x
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int len = str.length();
		
		String numBuff = "";//����������������
		
		for(int i = 0; i < len; i++){
			String k = Character.toString(str.charAt(i));
			if( cal.isNumberlic(k)){
				numBuff = numBuff + k;
			}
			
			if(!hasSetX && cal.isValidMark(k)){
				hasSetX = cal.setX(numBuff);
				numBuff = "";
				cal.setMark(k);
			}
			
			if(hasSetX && numBuff != ""  && cal.isValidMark(k)){
				cal.setY(numBuff);
				numBuff = "";
				cal.setX(cal.getResult());
				cal.setY(0);
				cal.setMark(k);
			}
			
			if(i == len - 1){
				cal.setY(numBuff);
				System.out.println(cal.getResult());
			}
			
			if(!cal.isValidMark(k) && !cal.isNumberlic(k)){
				System.out.println("�������󣬳����˳�");
				System.exit(-1);
			}
		}
	}
}
