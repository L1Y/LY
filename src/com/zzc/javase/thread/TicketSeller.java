package com.zzc.javase.thread;

public class TicketSeller implements Runnable{
	int count = 100;
	boolean arr[] = new boolean[count];
	public void run(){
		this.sell();
	}
	synchronized void sell(){
		for(int i=0; i<count ; i++){
			if(!arr[i]){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("��"+ (i+1) + "��Ʊ����" + Thread.currentThread().getName() + "�۳�");
				arr[i] = true;
			}
		}
		
	}

}
