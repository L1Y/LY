package com.zzc.javase.review;

import java.util.Random;

public class GetMaxMin {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random random = new Random();
		int[]array = new int[10];
		System.out.println("������ɵ������ǣ�");
		
		for(int i = 0; i < 10; i++){
			array[i] = random.nextInt(100);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		int min = array[0];
		int max = array[0];
		
		for(int i = 0; i < 10; i++){
			if(array[i] < min){
				min = array[i];
			}else if(array[i] > max){
				max = array[i];
			}
		}
		
		System.out.println("�����е����ֵ�ǣ�" + max);
		System.out.println("�����е���Сֵ�ǣ�" + min);
	}

}
