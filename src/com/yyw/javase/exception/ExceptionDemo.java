package com.yyw.javase.exception;

import java.util.Random;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɷ������

		try{
			System.out.println("�Ǻ�");
			int[] a = new int[]{1,0};
			Random r = new Random();
			int b = r.nextInt();
			//����0���鳬����С��0��������
			if(b > 0){
				System.out.println(b);
				a[3] = b;
			}
			System.out.println(b);
			a[1]=a[0] / a[1];
			
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ó�");
			e.printStackTrace();
		}catch(ArithmeticException e){
			System.out.println("��Ҳ�ó�");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e.toString());
			e.printStackTrace();
			
		}finally{
			System.out.println("�Ǻ�");
		}
	}

}
