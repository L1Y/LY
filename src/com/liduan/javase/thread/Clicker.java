package com.liduan.javase.thread;

public class Clicker implements Runnable{
	double click = 0;
	Thread t;
	private volatile boolean running = true;//��volatile�ؼ������εı��������п���������ֱ�ӷ����ڴ��С����Ʊ�static�ؼ������Ρ�
	
	public Clicker(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	
	@Override
	public void run() {
		while(running){
			click++;
		}
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
		tMain.setPriority(Thread.MAX_PRIORITY);//ͨ��setPriority�������̵߳����ȼ���
		
		Clicker h = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker l = new Clicker(Thread.NORM_PRIORITY - 2);
		
		l.start();
		h.start();
		
		try {
			Thread.sleep(10000);//��˯10��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		l.stop();
		h.stop();
		
		try{
			l.t.join();//�ж��߳�
			h.t.join();
		}catch(InterruptedException e){
			System.out.println("InterruptedException caught");
		}

		System.out.println("Low-priority thread:" + l.click);
		System.out.println("High-priority thread:" + h.click);
		System.out.println("�ٷֱ�:" + l.click / h.click);
		
	}

}
