package com.liduan.javase.thread;

public class ThreadDemo1 extends Thread{
	static ThreadDemo1 td1 = null;
	static boolean running = true;
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		while(running){
			i++;
			System.out.println("i:" + i);
		}
	}
	
	/*
	 * 当一个线程A启动另外一个线程B，则A可以控制线程B。但是如果A被中断或者不处于活动状态，B不会因为A的状态而影响自己
	 * */
	public static void main(String[] args) {
		Thread t = new Thread(){
			@Override
			public void run() {
				td1 = new ThreadDemo1();
				td1.start();
			}
		};
		t.start();
		System.out.println("t is alive:" + t.isAlive());
		try{
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		//td1.running = t.isAlive();
		System.out.println("t is alive:" + t.isAlive());
		
		if(!t.isAlive()){
			td1.running = true;
		}
		System.out.println("td1 is alive:" + td1.isAlive());
	}

}
