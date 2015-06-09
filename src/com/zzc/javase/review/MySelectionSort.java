package com.zzc.javase.review;

/**
 * 选择排序类
 * @author zzc
 *
 */
public class MySelectionSort {
	/**
	 * 执行选择排序，得到从小到大的有序序列
	 * @param arr 要排序的数组
	 */
	public void doSelectionSort(int arr[]){
		int len = arr.length;
		
		for(int i = 0; i < len-1; i++){
			int minIdx = i;//未排序数字中最小数的下标
			
			//for循环得到未排序数字中最小数的下标
			for(int j = i+1; j < len; j++){
				if(arr[j] < arr[minIdx]){
					minIdx = j;
				}
				
			}
			
			//把最小数和arr[i]交换
			swap(arr,i,minIdx);
		}
		
	}
	
	/**
	 * 交换数组中的两个元素
	 * @param arr 
	 * @param i
	 * @param j
	 */
	public void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
	
}
