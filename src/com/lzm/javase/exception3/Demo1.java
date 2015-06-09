package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * �ʼǣ�Exception
 * 
 *
 */

public class Demo1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * �쳣����
		 * try����Ҫ��catch�������ж����
		 * ����һ����finally
		 */
		try {
			System.out.println("�������һ������");
			num1 = scanner.nextInt();
			System.out.println("������ڶ�������");
			num2 = scanner.nextInt();
			
			System.out.println(num1+"/"+num2+"="+num1/num2);
			
			/**
			 * �쳣����
			 * �����쳣���Ȳ���
			 * ���������쳣����˳��
			 */
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
			scanner.close();
			System.out.println("���������");
		}
		

	}

}
