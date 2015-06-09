package com.zzc.javase.thread;

public class InnerThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("innerThread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(){
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				InnerThread it = new InnerThread();
				it.start();
			}
		};
		t.start();
		
	}

}
