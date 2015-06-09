package com.jiangmin.javase.calculator;

import java.util.Scanner;

/**
 * ����һ�����ڼ�������������
 * @author Administrator
 * @version V1.0.0
 */
public class Calculator {
	private int x;
	private int y;
	private String mark;

	/**
	 * ����һ�����ڼ������Ķ���
	 * @param x ��һ������ֵ
	 * @param y �ڶ�������ֵ
	 * @param mark �������
	 */
	public Calculator(int x, int y, String mark) {
		this.x = x;
		this.y = y;
		this.mark = mark;
	}
	
	/**
	 * ����һ�����ڼ������Ķ���
	 */
	public Calculator(){
		
	}

	/**
	 * ��ӡ�����
	 * 
	 * @return ����Ķ�Ӧֵ
	 */
	public int getResult() {
		if ("+".equalsIgnoreCase(mark)) {
			return x + y;
		} else if ("-".equalsIgnoreCase(mark)) {
			return x - y;
		} else if ("*".equalsIgnoreCase(mark)) {
			return x * y;
		} else if ("/".equalsIgnoreCase(mark)) {
			if (0 == y) {
				System.out.println("��������Ϊ0��");

				return 0;
			} else {
				return x / y;
			}
		} else {
			return 0;
		}
	}

	/**
	 * ����һ���ַ�����������x���߱���y��ֵ��
	 * 
	 * @param input
	 *            ����x����y�ַ����ֱ��Ӧx��y����
	 */
	public void judgeInt(char input) {
		Scanner scanner = new Scanner(System.in);

		String str;
		char[] ch;
		int length;

		out: while (true) {
			str = scanner.next();
			ch = str.toCharArray();
			length = ch.length;

			in: for (int i = 0; i < length; i++) {
				if (null == str) {
					System.out.println("X��Y����Ϊ�գ�����������");
					break in;
				} else if (!Character.isDigit(ch[i])) {
					System.out.println("������������������");
					break in;
				}
				if (length - 1 == i) {
					break out;
				}
			}
		}

		if ('x' == input) {
			x = Integer.valueOf(str);
		} else if ('y' == input) {
			y = Integer.valueOf(str);
		} else {

		}

		scanner.close();
	}

	/**
	 * �ж�������ַ����Ƿ�Ϊ������
	 * 
	 * @param str
	 *            ��Ҫ�жϵ��ַ���
	 * @return ����
	 */
	public boolean isNumber(String str) {
		char[] array = str.toCharArray();
		int length = array.length;

		for (int i = 0; i < length; i++) {
			if (array[i] >= '0' && array[i] <= '9') {

			} else {
				System.out.println("������������������");
				return false;
			}
		}

		return true;
	}

	/**
	 * �ж��Ƿ�Ϊ��Ч�����
	 * 
	 * @param str
	 *            Ŀ���ַ���
	 * @return
	 */
	public boolean isValidMark(String str) {
		String[] array = { "+", "-", "*", "/" };

		for (String item : array) {
			if (item.equals(str)) {
				return true;
			}
		}
		return false;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public boolean setX(String str){
		if(null != str && str.length() > 0){
			if(isNumber(str)){
				int value = Integer.valueOf(str);
				setX(value);
				
				return true;
			}			
		}

		return false;			
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean setY(String str){
		if(null != str && str.length() > 0){
			if(isNumber(str)){
				int value = Integer.valueOf(str);
				setY(value);
				
				return true;
			}		
		}

		return false;			
	}

	public int getY() {
		return y;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

}
