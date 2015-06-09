package com.zzc.javase.thread;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable ();
		new Thread(mr).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

}
