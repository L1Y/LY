package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseNum;
		//String[] course = new String[] {"����", "��ѧ", "Ӣ��"};
		
		String[] course = {"����", "��ѧ", "Ӣ��"};
		String answer;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("������γ̺ţ�");
			courseNum = scanner.nextInt();
			if (!(--courseNum>=0 && --courseNum-1<=2)) {
				
				//throw new Exception("�Զ����׳��쳣����ϵ");
				throw new MyException();
			}
			answer = course[courseNum];
			System.out.println("�γ��ǣ�" + answer);
			
		} catch (InputMismatchException e) {
			System.out.println("���벻ƥ��");
		} catch (MyException e) {
			System.out.println(e.toString());
			System.out.println("�γ̲�����");
		} catch (Exception e) {
			System.out.println("�����쳣");
		} finally {
			scanner.close();
			System.out.println("��ӭ�������");
		}

	}

}

//�Զ����쳣
class MyException extends Exception {
	
	@Override
	public String toString() {
		return "MyException";
	}
	
}
