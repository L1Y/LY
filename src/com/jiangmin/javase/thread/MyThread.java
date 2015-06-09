package com.jiangmin.javase.thread;

public class MyThread extends Thread{
	
	private static boolean threadSwitch = false;
	private double count = 0;
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		while(threadSwitch == false);
		while(threadSwitch){
			count++;
		}
	}

	public boolean isThreadsSwitch() {
		return threadSwitch;
	}

	public void setThreadsSwitch(boolean threadsSwitch) {
		this.threadSwitch = threadsSwitch;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	
	
	public static void main(String[] args) {
		//����main�߳�Ϊ��߼�
		Thread t = Thread.currentThread();
		t.setPriority(10);
		
		//���������߳�
		MyThread tLow = new MyThread("tLow");
		MyThread tHigh = new MyThread("tHigh");
		
		//���������߳�
		tLow.start();
		tHigh.start();
		
		//�����߳�ͬʱ����
		tLow.setThreadsSwitch(true);
		
		//���߳���ͣ5��
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//�����߳�ͬʱ�ر�
		tLow.setThreadsSwitch(false);
		
		double tLowCounter = tLow.getCount();
		double tHighCounter = tHigh.getCount();
		
		System.out.println("tLow:" + tLowCounter);
		System.out.println("tHigh:" + tHighCounter);
		System.out.println("�ٷֱȣ�" + (tLowCounter / tHighCounter));
	}

}
