package com.yangqiuhua.javase.exam;

public class ExamOne {

	public static void main(String[] args) {
		/*int total = 0;
		for(int i = 0,j = 10;total < 30; ++i,--j){
			System.out.println("i=" + i + ":j=" + j);
			total += (i + j);
		}
		System.out.println("Total" + total);*/
		
		long result = 1;
		for(int i = 2; i <=10; i++){
			result = result * i;
		}
		System.out.println(result);

	}

}
