package com.zzc.javase.review;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void main(String args[]){
		//构造MySelectionSort类对象
		MySelectionSort sel = new MySelectionSort();
		int arr[] = {31,12,17,3,7,99,38};
		
		//调用MySelectionSort类的doSelectionSort方法，传入参数arr
		sel.doSelectionSort(arr);
		
		//使用Arrays.toString()方法打印数组
		System.out.println(Arrays.toString(arr));
	}
}
