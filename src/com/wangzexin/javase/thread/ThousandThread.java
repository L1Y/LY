package com.wangzexin.javase.thread;

public class ThousandThread {

	
	public static void staticTest(){
		for(int i =0 ;i < 1000; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Counter.inc();
				}
			}).start();
		}
		System.out.println("static counter's count is " + Counter.count);
	}
	
	public static void volatileTest(){
		for(int i =0 ;i < 1000; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Counter.inc();
				}
			}).start();
		}
		System.out.println("volatile counter's count is " + Counter.count);
	}
	
	public static void main(String[] args){
		staticTest();
//		volatileTest();
	}
}

class Counter{
	
	public static int count = 0;
	public static void inc(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	}
}
