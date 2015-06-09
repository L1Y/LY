package com.yangqiuhua.javase.exam;

public class SelectSort {

	public static void main(String[] args) {
		/**
		 *实现选择排序
		 *每次从待排序的数中选出最小的数放在起始位置
		 */
			int[] array = new int[]{2,32,4,9,1,13,24};
			SelectSort sort = new SelectSort();
			sort.selectSort(array);
	  

		}
		
		//定义选择排序方法
		public void selectSort(int[] arr){
			int l = arr.length;
			int temp = 0;
			int min = 0;
			for(int i = 0; i < l; i++){
				//找出待排序数中值最小的元素的下标
				for(int j = l-1,m = j; j > i; j--){
					if(arr[m] > arr[j-1]){
						m = j - 1;
					}
					min = m;
				}
				//将最小值与起始处元素交换位置
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				}
			
			//打印排序后的数组元素
			System.out.println("排序后的结果为：");
			for(int i = 0; i < l; i++){
				System.out.print(arr[i] + "  ");
			}
		}
	}


