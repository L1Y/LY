package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 * 
 * һ���쳣����������
 * 1�������ǻ��жϳ��򣬶��쳣����
 *
 * ����try��catch�����ִ��˳��
 * 	���try���ж���쳣���ʱ������һ���쳣��������ʱ��try�еĴ�����ж�ִ��ͬʱת����Ӧ��catch�������
 */
public class ArithmeticExceptionDemo {
	public static void main(String[] args){
		try{
			/*���ܻᷢ���쳣�Ĵ���*/
			
			int[] array = new int[1];
			System.out.println(array[2]);
			
			System.out.println(1/0);
		}catch(ArithmeticException e){
			/*���쳣����ʱ��ִ�еĴ���*/
			e.printStackTrace();
			System.out.println("��������Ϊ0");
			/*���쳣����ʱ��ִ�еĴ���*/
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("����Խ����");
		}
		
		System.out.println("�쳣�������");
	}
}
