package com.chenxiaofeng.excep;
import java.util.Random;

public class ExceptionDemo {

	public static void main(String[] args){
		try{
			int x=new Random().nextInt();
			System.out.println("�������������ֳ���0��"+x+"/0 = ");
			System.out.println(x/0);
		}
		catch(Exception e){
			System.out.println("����"+e.getClass().getSimpleName()+"�쳣");
		}

		try{
			int[] array=new int[]{1,2};
			System.out.println("���Է�������{1,2}�ĵ�3��Ԫ��");
			System.out.println(array[2]);
		}
		catch(Exception e){
			System.out.println("����"+e.getClass().getSimpleName()+"�쳣");
		}
	}
}
