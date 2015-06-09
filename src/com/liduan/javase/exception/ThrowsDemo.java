package com.liduan.javase.exception;

/**
 * 
 * @author liduan
 *
 *	throws�����ã������о�һ�����������������쳣
 *	
 *	throw��throws������
 *	throw:ֻ��д�ڷ������ڣ�����������ȷ���쳣����
 *	throws:ֻ�������о�һ�����������������쳣
 *
 *	throws��try/catch������
 *	throws:ֻ���о���һ�����������������쳣�����������κδ���
 *	try/catch:����try���������쳣�����ܹ���catch���޸��쳣����ʱ�Ĵ���
 *
 *	�ڿ������Ƽ���Ҷ���try/catch
 *	
 */
public class ThrowsDemo {

	public static void main(String[] args) throws IllegalAccessException {
		throwOne();
		
		throwTwo();
		throwThree();
		System.out.println("main");
	}
	
	static void throwOne() throws IllegalAccessException {
		System.out.println("throwOne");
	}
	
	static void throwTwo(){
		try{
			throw new IllegalAccessException("throwTwo");
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	
	static void throwThree(){
		try{
			throw new IllegalAccessException("throwThree");
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}

}
