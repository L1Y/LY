package com.jiangmin.javase.thread;

public class Test {

	public static void main(String[] args) {
		staticTest();
		//volatileTest();
	}
	
	public static void staticTest(){
		for(int i = 0; i < 1000; i++){
			new Thread(new Runnable(){
				public void run(){
					new Counter().inc();
				}
			}).start();
		}
		System.out.println("[static] Counter's count is:" + new Counter().getCount());
	}
	
	/*public static void volatileTest(){
		for(int i = 0; i < 1000; i++){
			new Thread(new Runnable(){
				public void run(){
					Counter.inc();
				}
			}).start();
		}
		System.out.println("[static] Counter's count is:" + Counter.count);
	}*/
}

class Counter{
	public volatile int count = 0;
	
	public void inc() {
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		count++;
	}
	
	public int getCount(){
		return count;
	}
}
