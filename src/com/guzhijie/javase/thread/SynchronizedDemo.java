package com.guzhijie.javase.thread;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		method();
		
	}
	static void method(){
		CallMe1 target = new CallMe1();
		Caller1 c1 = new Caller1(target , "Hello");
		Caller1 c2 = new Caller1(target , "Wonderful");
		Caller1 c3 = new Caller1(target , "World");
	}
}

class CallMe1{
	void call(String msg){
		System.out.print("[" + msg);
		try {		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
		
	}
}
class Caller1 implements Runnable{
	String msg;
	CallMe1 target;
	Thread t;
	
	public Caller1(CallMe1 target, String msg){
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized(target){
			target.call(msg);
		}
		//target.call(msg);
	}
	
}