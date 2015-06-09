package com.lzm.javase.volatiledemo;



public class Test {

	public static void main(String[] args) {
		//staticTest();
		volatileTest();
		
	}
	
	//static���ԣ�
	public static void staticTest() {
		//����1000���߳�
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					StaticCounter.inc();
				}
			}).start();
		}
		System.out.println("[Static]Counter`s count is : " + StaticCounter.count);
	}
	
	//volatile���ԣ�
	public static void volatileTest() {
		//����1000���߳�
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					VolatileCounter.getInstanceCounter().inc();
				}
			}).start();
		}
		System.out.println("[Volatile]Counter`s count is : " + VolatileCounter.getInstanceCounter().count);
	}
}

/**
 * Static������
 */
class StaticCounter {
	public static int count = 0;
	public static void inc() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
	}
}

/**
 * Volatile������
 */
class VolatileCounter {
	private static final VolatileCounter vc = new VolatileCounter();
	public volatile int count = 0;
	public static VolatileCounter getInstanceCounter() {
		return vc;
	}
	public void inc() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
	}
}












