package com.cjq.javase.exam;

import java.util.Arrays;
import java.util.Random;

/**
 * ����һ������������е����ֵ����Сֵ���ࡣ
 * 
 * @author i_Mjunqi
 *
 */
public class GetMaxMin {

	/**
	 * �����������ʼ������(��ΧΪ0~100)
	 * 
	 * @param array
	 * @return
	 */
	public int[] initial(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			array[i] = new Random().nextInt(99) + 1;
		}
		return array;
	}

	/**
	 * ��ӡ�����е�Ԫ��
	 * 
	 * @param array
	 */
	public void printf(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {

		GetMaxMin g = new GetMaxMin();
		int[] str = new int[10];
		g.initial(str);
		System.out.println("������ɵ������ǣ�");
		g.printf(str);
		System.out.println("\n*******************************************");
		Arrays.sort(str); // ����Arrays���е�sort����
		System.out.println("�����е����ֵ�ǣ� " + str[str.length - 1]);
		System.out.println("�����е���Сֵ�ǣ� " + str[0]);
	}

}
