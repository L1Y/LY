package com.zhangxurui.javase.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int [] c = new int [5];
		
		try{
			System.out.println("请输入一个数:");
			a = sc.nextInt();
			System.out.println("请输入第二个数:");
			b = sc.nextInt();
			//除数不能为0
			System.out.println(a+"/"+b+"="+a/b);
			//数组越界
			System.out.println("输入数组：");
			for(int i=1;i<c.length+2;i++){
				 c[i] = sc.nextInt();
			}		
		}catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("除数不能为0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
			System.out.println("数组越界");
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			System.out.println("exit!");
		}
		sc.close();
	}

}
