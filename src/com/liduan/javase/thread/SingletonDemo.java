package com.liduan.javase.thread;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 ��s2�Ƿ�һ����" + (s1.equals(s2) ? "��" : "��"));
		System.out.println("s1 ��s2�Ƿ�һ����" + (s1 == s2 ? "��" : "��"));
		/*
		 * ==��equals������
		 * 1��������������֮��ֻ����==���Ƚϣ��Ҷ��Ƕ���ֵ���бȽ�
		 * 2����������(��)֮����==����equals���бȽϴ󲿷ֶ��ǽ��е�ַ�Ƚϣ�
		 * ����String�ͻ����������͵İ�װ�������д��equals���������������֮��ıȽ�
		 * */
	}

}

class Singleton{
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			System.out.println("Singleton.class:::" + Singleton.class);
			synchronized(Singleton.class){
				instance = new Singleton();
			}
		}
		
		return instance;
	}
}
