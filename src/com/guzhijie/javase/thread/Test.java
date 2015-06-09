package com.guzhijie.javase.thread;

public class Test {
	
	public static void staticTest(){
		for(int i = 0; i < 1000; i++){
			new Thread(new Runnable(){

				@Override
				public void run() {
					Counter.inc();
				}
				
			}).start();
		}
		System.out.println("[Static]Counter's count is:" + Counter.count);
	}
	
	public static void main(String[] args) {
		staticTest();
		
	}

}
class Counter{
	public static int count = 0;
	public static void inc(){
		try{
			Thread.sleep(0);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		count++;
	}
}
