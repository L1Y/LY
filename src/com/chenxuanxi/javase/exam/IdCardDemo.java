/**
 * 
 */
package com.chenxuanxi.javase.exam;

import java.util.Scanner;

/**
 * @author Daniel Chan
 *
 */
public class IdCardDemo {

	/**
	 * @param args
	 */
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String IdCard;
			System.out.println("请输入你要校验的身份证号码");
			IdCard = scanner.nextLine();
			int len = IdCard.length();
			String[] IdCardArm = new String[len];
			for (int i = 0; i < IdCardArm.length; i++) {
				IdCardArm[i] = String.valueOf(IdCard.charAt(i));
			}
			int[] checkNum = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };// 验证的系数17位
			int sum = 0;
			for (int i = 0; i < len - 1; i++) {
				int a = Integer.valueOf(IdCardArm[i]);
				int b = checkNum[i];
				sum = sum + a * b;
			}
			int yu = sum % 11;
			int x;
			switch (yu) {
			case 0:
				test('1',IdCardArm);
				break;
			case 1:
				test('0',IdCardArm);break;
			case 2:
				test('x',IdCardArm);break;
			case 3:
				test('9',IdCardArm);break;
			case 4:
				test('8',IdCardArm);break;
			case 5:
				test('7',IdCardArm);break;

			case 6:
				test('6',IdCardArm);break;

			case 7:
				test('5',IdCardArm);break;
			case 8:
				test('4',IdCardArm);break;
			case 9:
				test('3',IdCardArm);break;
			case 10:
				test('2',IdCardArm);break;
			}

		}

		public static void test(char c, String[] arr) {
	        String s=String.valueOf(c);
	        if (s.equals(arr[17])) {
				System.out.println("身份证有效");
			}else{
				System.out.println("无效的身份证");
			}
		}
	}

			

