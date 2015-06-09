package com.zzc.javase.thread;

public class MyThread extends Thread{
	private  int a = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		Thread2 t2 = new MyThread().new Thread2();
		t2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0; i < 100000; i++){
			System.out.println("running" + (i + 1));
		}
	}
	
class Thread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			System.out.println("炫迈，根本停不下来"+ MyThread.this.a);
		}
		
	}
}

}
