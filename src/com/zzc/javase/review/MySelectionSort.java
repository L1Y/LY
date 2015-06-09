package com.zzc.javase.review;

/**
 * ѡ��������
 * @author zzc
 *
 */
public class MySelectionSort {
	/**
	 * ִ��ѡ�����򣬵õ���С�������������
	 * @param arr Ҫ���������
	 */
	public void doSelectionSort(int arr[]){
		int len = arr.length;
		
		for(int i = 0; i < len-1; i++){
			int minIdx = i;//δ������������С�����±�
			
			//forѭ���õ�δ������������С�����±�
			for(int j = i+1; j < len; j++){
				if(arr[j] < arr[minIdx]){
					minIdx = j;
				}
				
			}
			
			//����С����arr[i]����
			swap(arr,i,minIdx);
		}
		
	}
	
	/**
	 * ���������е�����Ԫ��
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
