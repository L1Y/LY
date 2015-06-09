package com.liduan.javase.thread;

public class NewThread extends Thread{
	private boolean running = true;
	@Override
	public void run() {
		//��Java�����run���û�д����ִ�У��ͻ��Զ��������߳�
		System.out.println("NewThread");
		int i = 0;
		while(running){
			i++;
			System.out.println("i:" + i);
		}
	}
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public static void main(String[] args){
		System.out.println("main");
		NewThread nt = new NewThread();
		System.out.println("nt is alive:" + nt.isAlive());
		nt.start();
		//nt.interrupt();
		nt.setRunning(false);
		System.out.println("nt is alive:" + nt.isAlive());
		try {
			nt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("nt is alive:" + nt.isAlive());
		System.out.println("main exit");
	}
}
