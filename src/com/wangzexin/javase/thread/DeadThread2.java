package com.wangzexin.javase.thread;

public class DeadThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<100000000; i++)
			System.out.println("我不是死循环"+i);
	}
}
