package com.zzc.javase.review;

import java.util.Scanner;

public class IsoscelesTriangle {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		
		IsoscelesTriangle tri = new IsoscelesTriangle();
		tri.makeIsoscelesTriangle(height);
	}
	
	public void makeIsoscelesTriangle(int height){
		int array[][] = new int[height][15];
		int width = 2 * height - 1;
		for(int i = 0; i < height; i++){
			 
			int len = 2 * i + 1;
			
			array[i] = new int[len];//多维数组的定义
			
			for(int j = 0; j < (width - 2 * i - 1 )/2; j++ ){
				System.out.print(" ");
			}
			
			for(int j = 0; j < len ; j++){
				array[i][j] = i+1;
				if(i == j && i != 0){
					array[i][j] = i;
				}
				System.out.print(array[i][j] );
			}
			System.out.print("\n");
		}
	}
	
//	public void trianglePrint(int array [][]){
//		int len = array.length;
//		int width = 2 * len - 1; 
//		for(int i = 0; i < len; i++){
//			StringBuffer buff = new StringBuffer();
//			for(int j = 0; j < width; j++ ){
//				int count = 0;
//				if(j < len - i - 1  || j > len + i - 1 ){
//					buff = buff.append(' ');
//				}else{
//					buff = buff.append(Integer.toString(array[i][count]));
//					count++;
//				}
//			}
//			System.out.println(buff);
//		}
//	}
}
