package com.zhenshuyu.javase.algorithm;

import java.util.Arrays;

public class AlgorithmDemo {

	public static void main(String[] args) {
		int[] array = {2, 1, 6, 4 , 5, 9};
		
		System.out.println("����ǰ�����飺" + Arrays.toString(array));
		
		Algorithm alg = new Algorithm();
		//alg.doBubbleSort(array);
		alg.doSelectionSort(array);
		//alg.doInsertionSort(array);
		System.out.println("���������飺" + Arrays.toString(array));
	}

}
