package com.zouyuejian.javase.thread;

public class CompareThread {
	public static void main(String[] args){
		MyThread1 my1 = new MyThread1();
		MyThread2 my2 = new MyThread2();
		my1.start();   //start����ֻ�������̣߳�����ʲôʱ�������̣߳�Ҫ�ȵ��߳�����CPU�Ŀ���Ȩ�Ż�ִ��
		
		my2.start();
		/*
		 * 
		 */
	}
}

class MyThread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("����ͣ������");
		}
	}
}
