package com.liduan.javase.thread;

public class ThreadDemo extends Thread{
	public static int i = 0;
	public void run() {}{
		inc();
	}
	
	public int getI(){
		return i;
	}
	
	public static void inc(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i++;
	}
	
	public static void main(String[] args){
		ThreadDemo t = null;
		for(int i = 0; i < 1000; i++){
			t = new ThreadDemo();
			t.start();
		}
		
		System.out.println(t.getI());
	}
	
}
