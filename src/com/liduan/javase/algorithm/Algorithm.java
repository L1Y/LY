package com.liduan.javase.algorithm;

/**
 * �㷨��
 * @author liduan
 * ��ϵ��ʽ	441924919@qq.com
 * ����Ϊ�㷨��װ��
 */
public class Algorithm {
	
	/**
	 * ð�����򣺰������������ֶԱȣ��Ѵ������Ԫ��������
	 * @param array	Ҫ�����������
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
	
	public void doBubbleSortByDesc(int[] array){
		int len = array.length;
		
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len - i - 1; j++){
				if(array[j] < array[j + 1]){
					doSwap(array, j + 1, j);
				}
			}
		}
	}
	
	/**
	 * ѡ������ÿһ���ҳ���������С��һ��Ԫ�أ�Ȼ���ٽ���λ��
	 * @param array
	 */
	public void doSelectionSort(int[] array){
		int len = array.length;
		
		for(int i = 0; i < len - 1; i++){
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
	 * ��������
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
}
