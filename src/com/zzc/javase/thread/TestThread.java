package com.zzc.javase.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread tt = new TestThread();
		tt.staticTest();
		

	}
	
	public static void staticTest(){
		for(int i = 0; i<1000; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					new counter().plus();
				}
			}).start();
		}
		System.out.println(new counter().count);
	}

}
class counter{
	public volatile  int count = 0;
	public  void plus(){
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.count++;
		
	}
}
