package com.yangqiuhua.javase.exam;

public class SelectSort {

	public static void main(String[] args) {
		/**
		 *ʵ��ѡ������
		 *ÿ�δӴ����������ѡ����С����������ʼλ��
		 */
			int[] array = new int[]{2,32,4,9,1,13,24};
			SelectSort sort = new SelectSort();
			sort.selectSort(array);
	  

		}
		
		//����ѡ�����򷽷�
		public void selectSort(int[] arr){
			int l = arr.length;
			int temp = 0;
			int min = 0;
			for(int i = 0; i < l; i++){
				//�ҳ�����������ֵ��С��Ԫ�ص��±�
				for(int j = l-1,m = j; j > i; j--){
					if(arr[m] > arr[j-1]){
						m = j - 1;
					}
					min = m;
				}
				//����Сֵ����ʼ��Ԫ�ؽ���λ��
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				}
			
			//��ӡ����������Ԫ��
			System.out.println("�����Ľ��Ϊ��");
			for(int i = 0; i < l; i++){
				System.out.print(arr[i] + "  ");
			}
		}
	}


