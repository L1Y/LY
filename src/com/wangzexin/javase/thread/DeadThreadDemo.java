package com.wangzexin.javase.thread;

public class DeadThreadDemo {
	
	public static void main(String[] args){
		DeadThread dt = new DeadThread();
		DeadThread2 dt2 = new DeadThread2();
//		dt2.start();
		dt.start();
		dt2.start();
	}
}
