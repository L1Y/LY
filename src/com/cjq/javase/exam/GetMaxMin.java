package com.cjq.javase.exam;

import java.util.Arrays;
import java.util.Random;

/**
 * 这是一个求随机数列中的最大值和最小值的类。
 * 
 * @author i_Mjunqi
 *
 */
public class GetMaxMin {

	/**
	 * 利用随机数初始化数组(范围为0~100)
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
	 * 打印数组中的元素
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
		System.out.println("随机生成的数列是：");
		g.printf(str);
		System.out.println("\n*******************************************");
		Arrays.sort(str); // 调用Arrays类中的sort方法
		System.out.println("此数列的最大值是： " + str[str.length - 1]);
		System.out.println("此数列的最小值是： " + str[0]);
	}

}
