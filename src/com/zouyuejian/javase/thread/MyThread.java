package com.zouyuejian.javase.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("this is my first thread");
	}
	
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();
	}
	
}
