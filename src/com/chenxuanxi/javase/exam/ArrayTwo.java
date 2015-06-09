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
	 * 选择排序：每一次找出数组中最小的一个元素，然后再交换位置
	 * @param array
	 */
	public void doSelectionSort(int[] array){
		int len = array.length;
		
		for(int i = 0; i < len; i++){
			int minIndex = i;//假设每一次i都是最小的
			
			for(int j = i + 1; j < len; j++){
				if(array[minIndex] > array[j]){
					minIndex = j;
				}
			}
			
			doSwap(array, i, minIndex);
		}
	}
	
	/**
	 * 交换数组中，指定位置的两个元素
	 * @param array	目标数组
	 * @param i	第一个位置
	 * @param j	第二个位置
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
		System.out.println("排序后的数组：" + Arrays.toString(array));
	}		
}