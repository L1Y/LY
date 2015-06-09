package com.aisiwei.javase.defalut;

import java.util.Scanner;

public class classname {

	public static void main(String[] args) {
		 int num;
		 String name = null;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("请输入数字1~3");
		 try{
			
			 num = scanner.nextInt();
			
			 if (num == 1)
			 {
				name= "no.1课程";
			 }
			 else if (num == 2)
			 {
				 name ="no.2课程";
			 }
			 else if(num == 3)
			 {
				 name = "no.3课程";
			 }
			 else
			 {
				throw new Exception("您输入的并非数字1~3");
			 }
		 }catch(Exception e )
		 {
			 e.printStackTrace();
		 }
		 
		 finally{
			 System.out.println(name);
			 System.out.println("欢迎提出建议");
			 scanner.close();
		 }
		 

	}

}
