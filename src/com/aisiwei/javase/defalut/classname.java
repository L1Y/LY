package com.aisiwei.javase.defalut;

import java.util.Scanner;

public class classname {

	public static void main(String[] args) {
		 int num;
		 String name = null;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("����������1~3");
		 try{
			
			 num = scanner.nextInt();
			
			 if (num == 1)
			 {
				name= "no.1�γ�";
			 }
			 else if (num == 2)
			 {
				 name ="no.2�γ�";
			 }
			 else if(num == 3)
			 {
				 name = "no.3�γ�";
			 }
			 else
			 {
				throw new Exception("������Ĳ�������1~3");
			 }
		 }catch(Exception e )
		 {
			 e.printStackTrace();
		 }
		 
		 finally{
			 System.out.println(name);
			 System.out.println("��ӭ�������");
			 scanner.close();
		 }
		 

	}

}
