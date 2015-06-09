package com.jiangmin.javase.thread;

public class MyThread2 extends Thread{
	Thread t;
	String target;
	
	public MyThread2(){
		
		t = new Thread();
	}
	
	public void run(){
		System.out.println("haha");
	}
	
}
