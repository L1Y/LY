package com.liduan.javase.thread;

/**
 * 
 * @author liduan
 *
 *	���������⣺�߳���ͨ��run()������������start()����
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("this is my first runnable class");
		int j = 0;
		while(j < 10){
			j++;
			System.out.println("j:" + j);
		}
	}
	
	public static void main(String[] args){
		MyRunnable mr = new MyRunnable();
		new Thread(mr).start();//�߳���ͨ��start��������
	}

}
