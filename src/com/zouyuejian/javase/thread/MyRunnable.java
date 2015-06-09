package com.zouyuejian.javase.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Ö£Ö¾³¬ÊÇ¸öÉµ±Æ");
	}
	
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr).start();
	}
	
}
