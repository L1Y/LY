package com.panxiaoguang.javase.thread;



public class Test {

	public static void main(String[] args) {
		staticTest();
		//volatileTest();
		
	}
	
	//static���ԣ�
	public static void staticTest() {
		//����1000���߳�
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					Counter.inc();
				}
			}).start();
		}
		System.out.println("[Static]Counter`s count is : " + Counter.count);
	}
	
	//volatile���ԣ�
	public static void volatileTest() {
		//����1000���߳�
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					Counter.inc();
				}
			}).start();
		}
		System.out.println("[Volatile]Counter`s count is : " + Counter.count);
	}
}

class Counter {
	public volatile static int count = 0;
	public static void inc() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
	}
}












