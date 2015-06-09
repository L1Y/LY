package com.chenxiaofeng.review;

import java.util.Scanner;

public class Calculator {

	private int x;
	private int y;
	private String mark;
	private Scanner input;

	public Calculator(boolean intoMainInterface) {
		input = new Scanner(System.in);
		if (intoMainInterface)
			mainInterface();
		else
			try {
				System.out.println(Scan(input.nextLine()));
			} catch (NumberFormatException e) {
				System.out.println("����ĸ�ʽ");
			}
	}

	public Calculator(int x, int y, String s) {
		if (isLegal(s))
			mark = s;
		else
			throw new IllegalArgumentException("�޷�ʹ��������");
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getMark() {
		return mark;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	private int Scan(String s) {
		if (s.isEmpty())
			throw new NumberFormatException();
		int x, y, index;
		String mark;
		index = 0;
		if ((x = numberOfIndex(s, index)) < 0)
			throw new NumberFormatException();
		else
			index += String.valueOf(x).length();
		while (index < s.length()) {
			mark = String.valueOf(s.charAt(index++));
			if (!isLegal(mark))
				throw new NumberFormatException();
			if ((y = numberOfIndex(s, index)) < 0)
				throw new NumberFormatException();
			else
				index += String.valueOf(y).length();
			x = new Calculator(x, y, mark).getResult();
		}

		return x;
	}

	private int numberOfIndex(String s, int index) {
		int count = 0;
		for (int i = index; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				count++;
			else if (count == 0)
				return -1;
			else
				break;
		}
		return Integer.parseInt(s.substring(index, index + count));
	}

	private boolean isLegal(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			return true;
		return false;
	}

	private boolean quit(String s) {
		if (s.equals("q") || s.equals("Q"))
			return true;
		return false;
	}

	private boolean reset(String s) {
		if (s.equals("c")) {
			System.out.println("���óɹ�");
			return true;
		}
		return false;
	}

	private String inputMark() {
		System.out.print("���������(+,-,*,/,=)��");

		String s = input.nextLine();
		if (s.isEmpty()) {
			System.out.println("���������Ϊ�գ�����������");
			return inputMark();
		}
		if (quit(s)) {
			System.out.println("�������˳�����лʹ��");
			input.close();
			System.exit(0);
		}
		if (reset(s)) {
			mainInterface();
		}
		if (isLegal(s) || s.equals("="))
			return s;
		else {
			System.out.println("�޷�ʶ��Ĳ�����������������");
			return inputMark();
		}
	}

	private int inputNumber() {
		System.out.print("�������֣�");

		String s = input.nextLine();

		if (s.isEmpty()) {
			System.out.println("X��Y����Ϊ�գ�����������");
			return inputNumber();
		}
		if (quit(s)) {
			System.out.println("�������˳�����лʹ��");
			input.close();
			System.exit(0);
		}
		if (reset(s)) {
			mainInterface();
		}
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("���Ǵ����֣�����������");
			return inputNumber();
		}
	}

	public int getResult() {
		if (mark.equals("+"))
			return x + y;
		if (mark.equals("-"))
			return x - y;
		if (mark.equals("*"))
			return x * y;
		if (mark.equals("/")) {
			try {
				return x / y;
			} catch (ArithmeticException e) {
				System.out.println("��������Ϊ0");
			}
		}
		return 0;
	}

	public void mainInterface() {
		int x, y;
		String mark;

		x = inputNumber();
		while (true) {
			mark = inputMark();
			if (mark.equals("="))
				System.out.println("��������" + x);
			else {
				y = inputNumber();
				x = new Calculator(x, y, mark).getResult();
			}
		}
	}
}
