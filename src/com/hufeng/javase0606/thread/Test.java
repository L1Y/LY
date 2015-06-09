package com.hufeng.javase0606.thread;

public class Test {
//	
//	public static void staticTest(){
//		for(int i =0;i<1000;i++){
//			new Thread (new Runnable(){
//				@Override
//				public void run() {
//					Counter.te();
//				}
//			}).start();
//			}
//		System.out.println("staticText::" + Counter.count);
//	}
	public static void volatileTest(){
		for(int i =0;i<1000;i++){
			new Thread (new Runnable(){
				@Override
				public void run() {
					Counter.te();
				}
			}).start();
			}
		System.out.println("volatileText::" + Counter.count);
	}
	public static void main(String[] args){
//		staticTest();
		volatileTest();
	}

}
class Counter{
	public volatile static int count;
	public static void te(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		count++;
	}
}