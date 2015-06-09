package com.guzhijie.javase.thread;

public class GuRunnable implements Runnable {

	@Override
	public void run() {
		//System.out.println("runnable class~~~");

		
			

	}
	
	public static void main(String[] args){
		GuRunnable gu = new GuRunnable();
		//new Thread(gu).start();
		gu.run();
	}
}
