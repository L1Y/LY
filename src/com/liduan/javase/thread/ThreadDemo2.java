package com.liduan.javase.thread;



public class ThreadDemo2 {

	public static void main(String[] args) {
		staticTest();
		//volatileTest();
		
	}
	
	//static测试：
	public static void staticTest() {
		//创建1000个线程
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
	
	//volatile测试：
	public static void volatileTest() {
		//创建1000个线程
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
	public static int count = 0;
	public static void inc() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
	}
}












