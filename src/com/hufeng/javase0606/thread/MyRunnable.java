package com.hufeng.javase0606.thread;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		mr.run();
		
	}	
	
	@Override
	public void run() {
		
		while(true){
			System.out.println("GG");
		}
		
		
	}

}
