package com.yyw.javase.inherit;

public class InterfaceDemo {
	
	public static void main(String[] args){
		
	}
	
}
/*
 *    �﷨��interface �ӿ�����{}���з���������ʵ��
        1���ӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η�
            1��ȫ�ֳ�����public static final����������
            2�����󷽷���public abstract�����з�������
            5��������һ���Ǹ�����
                �ǵġ�
            ����������ĳ�����
 */

interface Switch{
	public static int NUM = 10;
	public abstract void open();
	float PI = (float)3.14;
	void close();
}