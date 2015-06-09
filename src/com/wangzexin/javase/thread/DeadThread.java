package com.wangzexin.javase.thread;

public class DeadThread extends Thread{
	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		while(true){
			System.out.println("À¿—≠ª∑" + i++);
		}
	}
}
