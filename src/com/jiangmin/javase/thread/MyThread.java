package com.jiangmin.javase.thread;

public class MyThread extends Thread{
	
	private static boolean threadSwitch = false;
	private double count = 0;
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		while(threadSwitch == false);
		while(threadSwitch){
			count++;
		}
	}

	public boolean isThreadsSwitch() {
		return threadSwitch;
	}

	public void setThreadsSwitch(boolean threadsSwitch) {
		this.threadSwitch = threadsSwitch;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	
	
	public static void main(String[] args) {
		//设置main线程为最高级
		Thread t = Thread.currentThread();
		t.setPriority(10);
		
		//创建两个线程
		MyThread tLow = new MyThread("tLow");
		MyThread tHigh = new MyThread("tHigh");
		
		//启动两个线程
		tLow.start();
		tHigh.start();
		
		//两个线程同时开启
		tLow.setThreadsSwitch(true);
		
		//主线程暂停5秒
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//两个线程同时关闭
		tLow.setThreadsSwitch(false);
		
		double tLowCounter = tLow.getCount();
		double tHighCounter = tHigh.getCount();
		
		System.out.println("tLow:" + tLowCounter);
		System.out.println("tHigh:" + tHighCounter);
		System.out.println("百分比：" + (tLowCounter / tHighCounter));
	}

}
