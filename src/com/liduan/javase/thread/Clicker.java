package com.liduan.javase.thread;

public class Clicker implements Runnable{
	double click = 0;
	Thread t;
	private volatile boolean running = true;//用volatile关键字修饰的变量不会有拷贝，而是直接访问内存中。类似被static关键字修饰。
	
	public Clicker(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	
	@Override
	public void run() {
		while(running){
			click++;
		}
	}
	
	public void stop(){
		running = false;
	}
	
	public void start(){
		t.start();
	}
	
	public static void main(String[] args){
		Thread tMain = Thread.currentThread();
		System.out.println(tMain.getName());
		tMain.setPriority(Thread.MAX_PRIORITY);//通过setPriority来设置线程的优先级数
		
		Clicker h = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker l = new Clicker(Thread.NORM_PRIORITY - 2);
		
		l.start();
		h.start();
		
		try {
			Thread.sleep(10000);//沉睡10秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		l.stop();
		h.stop();
		
		try{
			l.t.join();//中断线程
			h.t.join();
		}catch(InterruptedException e){
			System.out.println("InterruptedException caught");
		}

		System.out.println("Low-priority thread:" + l.click);
		System.out.println("High-priority thread:" + h.click);
		System.out.println("百分比:" + l.click / h.click);
		
	}

}
