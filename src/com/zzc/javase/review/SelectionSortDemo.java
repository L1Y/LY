package com.zzc.javase.review;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void main(String args[]){
		//����MySelectionSort�����
		MySelectionSort sel = new MySelectionSort();
		int arr[] = {31,12,17,3,7,99,38};
		
		//����MySelectionSort���doSelectionSort�������������arr
		sel.doSelectionSort(arr);
		
		//ʹ��Arrays.toString()������ӡ����
		System.out.println(Arrays.toString(arr));
	}
}
