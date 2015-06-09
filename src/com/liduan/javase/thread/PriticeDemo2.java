package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *2��ģ���վ��Ʊ���򣬿�������������Ʊֱ����100��Ʊ����Ϊֹ��
 */
public class PriticeDemo2 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		new Thread(st, "����һ").start();
		new Thread(st, "���ڶ�").start();
		new Thread(st, "������").start();
	}
}

class SaleTicket implements Runnable{
	private int cnt = 100;
	
	@Override
	public void run(){
		/*
		 * 1�������synchronized����run������û���κ�Ч��
		 * 2��������ܹ��̳��������̵߳Ļ��������synchronized�����θ�����ķ�����û���κ�Ч��
		 * */
		//��֤����1
		while(true){
			synchronized (PriticeDemo2.obj) {
				if(cnt > 0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "�۳���Ʊ���Ϊ��" + cnt--);
				}else{
					break;
				}
			}
		}
		//sale();//ִ�п�һ�´�ӡ���
	}
	
	public synchronized void sale(){
		while(true){
			if(cnt > 0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "�۳���Ʊ���Ϊ��" + cnt--);
			}else{
				break;
			}
		}
	}
}
