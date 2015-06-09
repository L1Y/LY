/**
 * 
 */
package com.chenxuanxi.javase.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Chan
 *
 */
public class ArrayTwo {

	/**
	 * ѡ������ÿһ���ҳ���������С��һ��Ԫ�أ�Ȼ���ٽ���λ��
	 * @param array
	 */
	public void doSelectionSort(int[] array){
		int len = array.length;
		
		for(int i = 0; i < len; i++){
			int minIndex = i;//����ÿһ��i������С��
			
			for(int j = i + 1; j < len; j++){
				if(array[minIndex] > array[j]){
					minIndex = j;
				}
			}
			
			doSwap(array, i, minIndex);
		}
	}
	
	/**
	 * ���������У�ָ��λ�õ�����Ԫ��
	 * @param array	Ŀ������
	 * @param i	��һ��λ��
	 * @param j	�ڶ���λ��
	 */
	public void doSwap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array ={11,45,2,65,78,34} ;
		ArrayTwo alg = new ArrayTwo();
		alg.doSelectionSort(array);
		System.out.println("���������飺" + Arrays.toString(array));
	}		
}