package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		/**
		 * ������������
		 * ��������ŵ��Ҵ�����
		 */
		try {
			int num1;
			int num2;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������һ������");
			num1 = scanner.nextInt();
			System.out.println("������ڶ�������");
			num2 = scanner.nextInt();
			
			System.out.println(num1+"/"+num2+"="+num1/num2);
			
			/**
			 * scanner������finally���Ѿ�ʧЧ
			 */
			scanner.close();
			
		} catch (ArithmeticException e) {
			System.out.println("���벻ƥ��");
		} catch (InputMismatchException e) {
			System.out.println("����Ϊ��");
		} catch (Exception e) {
			System.out.println("�����쳣��");
		} finally {
			
			/**
			 * �ͷ���Դ
			 */
			//scanner.close();
			System.out.println("���������");
		}
		

	}

}
