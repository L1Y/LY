package com.zouyuejian.javase.exception;
/**
 * 
 * @author zyj
 *
 *  Throws�����ã������о�һ�����������������쳣
 *  һ����ͷ������Ѫ��
 *  throw��throws������
 *  throw��ֻ��д�ڷ������ڣ�����������ȷ���쳣��
 *  throws��ֻ�������о�һ�����������������쳣
 *
 *  throws��try/catch������
 *  throws��ֻ���о���һ�����������������쳣�����������κδ���
 *  try/catch������try���������쳣�����ܹ���catch���޸��쳣����ʱ�Ĵ���
 *
 *  �ڿ������Ƽ���Ҷ���try/catch
 * 
 */
public class ThrowsDemo {
	public static void main(String[] args) {
		int a = throw1();
		System.out.println(a);
 	}
	
	public static int throw1(){
		try{
			System.out.println("������");
			System.out.println("ɵ��");
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println(2);
		}
		return 0;
	}
	
}
