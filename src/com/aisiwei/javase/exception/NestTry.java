package com.aisiwei.javase.exception;

public class NestTry {

	public static void main(String[] args) {
	
		try{
			
			try{
				int[] array = new int[] {1,2,3};
				System.out.println(array[3]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
				System.out.println("����Խ��");
			}
			int x = 2/0;
		}
		catch(ArithmeticException e )
		{
			e.printStackTrace();
			System.out.println("��ѧ�������");
			
			
		}

	}

}
