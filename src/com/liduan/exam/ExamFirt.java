package com.liduan.exam;

public class ExamFirt {

	public static void main(String[] args) {
//		float i = 1f;
		
//		int x = 4;
//		System.out.println((x == 4) ? 99 : 9.0);
		
//		byte b1 = 1;
//		byte b2 = 2;
//		byte b = (byte)(b1 + b2);
		
//		int n = 100;
//		for(; true;){
//		}
//		System.out.println();
		
//		for(int i = 0; i < 3; i++){
//			System.out.println(i);
//		}
//		
//		int i = 5;
//		do{
//			System.out.print(i);
//		}while(--i > 5);
//		System.out.print("finished");
		
//		int i = 1, j = 2;
//		if(i++ == --j){
//			System.out.println("i:" + i + " , j:" + j);
//		}
		
		int[] arrOne = {2, 1, 4, 5, 6};
		int[] arrTwo = {2, 4, 7, 1, 6};
		
		int a = 0, b = 0;
		
		for(int i = 0; i < arrOne.length; i++){
			for(int j = 0; j < arrTwo.length; j++){
				int one = arrOne[i];
				int two = arrTwo[j];
				if(i == j && one == two){
					a++;
				}else if(i != j && one == two){
					b++;
				}
			}
		}
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}
