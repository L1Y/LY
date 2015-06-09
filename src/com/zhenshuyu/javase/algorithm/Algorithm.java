package com.zhenshuyu.javase.algorithm;

/**
 * 算法类
 * @author liduan
 * 联系方式	441924919@qq.com
 * 该类为算法封装类
 */
public class Algorithm {
	
	/**
	 * 冒泡排序：把相邻两个数字对比，把大的数组元素往后移
	 * @param array	要被排序的数组
	 */
	public void doBubbleSort(int[] array){
		int len = array.length;
		
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len - i - 1; j++){
				if(array[j] > array[j + 1]){
					doSwap(array, j, j + 1);
				}
			}
		}
	}
	
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
	 * 插入排序：
	 * @param array
	 */
	public void doInsertionSort(int[] array){
		int len = array.length;
		
		for(int i = 1; i < len; i++){
			int temp = array[i];
			int j;
			for(j = i - 1; j >= 0; j--){
				if(temp < array[j]){
					array[j + 1] = array[j];
				}else{
					break;
				}
			}
			
			array[j + 1] = temp;
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
}
