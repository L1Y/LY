package com.xurui.javase.review;

import java.util.*;

public class Homework {

	public static void main(String[] args) {
		int op1,op2,result;
		char operator;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������֣��Ӽ��˳����ȺŶ�Ҫ�ÿո����");
		
		op1 = sc.nextInt();
		operator = (sc.next()).charAt(0);
		result = op1;
		
		System.out.println("PS���ó���ʵ�ֵļ�������ȼ�Ϊ������");
		//for(int i=0;i<100;i++){
		while(operator!='='){
			op2 = sc.nextInt();
			if(operator == '+'){
				result += op2;
			}else if(operator == '-'){
				result -= op2;
			}else if(operator == '*'){
				result *= op2;
			}else if(operator == '/'){
				if(op2 ==0){
					System.out.println("��������Ϊ0");
				}else{
					result /= op2;
				}
			}
			
			operator = (sc.next()).charAt(0);
			
				
		}
		//}
		System.out.println(result);

	
	}

}