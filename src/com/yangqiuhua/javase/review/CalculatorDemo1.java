package com.yangqiuhua.javase.review;

import java.util.Scanner;

public class CalculatorDemo1 {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		
		boolean isSetX = false; //�Ƿ�������X��ֵ

	   
		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			if("=".equalsIgnoreCase(str)){
				System.out.println(cal.getX() + cal.getMark() + cal.getY() + "= " + cal.getResult());
				
				cal.setX(cal.getResult()); //��������ʱ����һ������������X
				cal.setMark(null);
				
			}else if("q".equalsIgnoreCase(str)){
				System.out.println("�˳�����");
				sc.close();
				
				break;
			}else if("c".equalsIgnoreCase(str)){
				System.out.println("���óɹ�");
				
				isSetX = false;
				cal.setX(0);
				cal.setY(0);
				cal.setMark(null);
				
			}else{
				if(!isSetX && !cal.isValidMark(str)){
					isSetX = cal.setX(str);
				}
				
				if(cal.isValidMark(str)){
					cal.setMark(str);
					isSetX = true;
				}
				
				if(cal.getMark() != null && !cal.isValidMark(str)){
					cal.setY(str);
				}
			}
		}
	}
	
}
