package com.starlight.javase.review;

import java.util.Scanner;

import com.starlight.javase.review.Caculator;

/**
 * @version Alpha
 * @author Flying Starlight
 * ����ʵ�����㹦�ܣ���û�м���ѭ�����˳��ж�
 * �ڿ���Ҫ��Ҫ��demo����һ����װ
 *
 */
public class CalculatorDemo {

	static String str; // this represents the input from keyboard
	static int i = 0;
	static char ch = '0';
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Caculator cal = new Caculator(0,0,'0');
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		str = sc.nextLine();
		cal.setX(cal.convertToInt(str));
		System.out.println("��������Ҫ��������������");
		str = sc.nextLine();
		str.replace(" ", ""); //ȥ���ո�
		ch = str.charAt(0);
		cal.isValidOperator(ch);
		System.out.println("������ڶ�����");
		str = sc.nextLine();
		cal.setY(cal.convertToInt(str));
		if(cal.getFlag() == 3){
			cal.calting(cal.getOperator(), cal.getX(), cal.getY());
			if( cal.getY() == 0 && cal.getOperator() == '/'){	
			}else{
				System.out.println(cal.getResult());
			}
		}

		

	}


}


