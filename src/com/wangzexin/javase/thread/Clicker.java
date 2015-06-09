package com.wangzexin.javase.thread;

public class Clicker implements Runnable{

	int click = 0;
	Thread t ;
	private volatile boolean running = true;
	
	public Clicker(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running)
			click++;
	}
	
	public void stop(){
		running = false;
	}
	
	public void start(){
		t.start();
	}
	
	public static void main(String[] args){
		Thread tMain = Thread.currentThread();
		System.out.println(tMain.getName());
		tMain.setPriority(Thread.MAX_PRIORITY);
		
		Clicker h = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker l = new Clicker(Thread.NORM_PRIORITY - 2);
		
		l.start();
		h.start();
		
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		l.stop();
		h.stop();
		
		try{
			l.t.join();
			h.t.join();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Low_Priority thread: " + l.click);
		System.out.println("High_Priority thread: " + h.click);
		System.out.println("Percent:" + l.click * 1.0d / h.click);
		
	}
}
