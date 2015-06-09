package com.panxiaoguang.javase.thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//System.out.println("this is my first thread");
		int i;
		for(i=0;i<10000;i++)
			System.out.println(i);
		for(;;)
			System.out.println("si ji la ");
	}
	
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();
	}

}
