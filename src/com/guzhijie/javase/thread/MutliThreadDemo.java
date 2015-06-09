package com.guzhijie.javase.thread;

public class MutliThreadDemo {

	public static void main(String[] args) {
		try {
		MutliThread m1 = new MutliThread("Window 1");
		MutliThread m2 = new MutliThread("Window 2");
		MutliThread m3 = new MutliThread("Window 3");
		m1.start();
		m1.join();
		m2.start();
		m2.join();
		m3.start();
		m3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MutliThread extends Thread {
	private int ticket = 100;// 每个线程都拥有100张票
	MutliThread(String name) {
		super(name);// 调用父类带参数的构造方法
	}

	public void run(){
		while (ticket > 0){
			System.out.println(ticket-- + " is saled by " + Thread.currentThread().getName());
		}

	}

}