package com.zzc.javase.calculator;

import java.util.Scanner;

public class CalculatorDemo2 {
	public static void main(String args[]){
		Calculator cal = new Calculator();
		
		boolean hasSetX = false;//�Ƿ��Ѿ�����x
		boolean hasSetY = false;//�Ƿ��Ѿ�����y
		
		while(true){
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			
			if("=".equals(str)){
				System.out.println(cal.getX() + cal.getMark() + cal.getY() + "=" + cal.getResult() );
				
				cal.setX(cal.getResult());
				hasSetY = false;
				cal.setMark(null);
				
			}else if("q".equalsIgnoreCase(str)){
				System.out.println("�������˳�����лʹ��");
				in.close();
				break;
				
			}else if("c".equalsIgnoreCase(str)){
				System.out.println("���óɹ�");
				
				hasSetX = false;
				hasSetY = false;
				cal.setX(0);
				cal.setY(0);
				cal.setMark(null);
				
			}else{
				if(!hasSetX && !cal.isValidMark(str)){//Ϊʲô
					hasSetX = cal.setX(str);
				}
				
				if(cal.isValidMark(str)){
					cal.setMark(str);
					hasSetX = true;
				}
				
				if(!hasSetY && cal.getMark() != null && !cal.isValidMark(str) ){
					hasSetY = cal.setY(str);
				}
			}
			
		}
	}
}
