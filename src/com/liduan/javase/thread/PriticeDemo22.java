package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *2��ģ���վ��Ʊ���򣬿�������������Ʊֱ����100��Ʊ����Ϊֹ��
 */
public class PriticeDemo22 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//��֤����2
//		new SaleTicket1("����һ").start();
//		new SaleTicket1("���ڶ�").start();
//		new SaleTicket1("������").start();
		//����2��֤����
		SaleTicket1 st = new SaleTicket1("");
		new Thread(st, "����һ").start();
		new Thread(st, "���ڶ�").start();
		new Thread(st, "������").start();
	}
}

class SaleTicket1 extends Thread{
	private int cnt = 100;
	
	public SaleTicket1(String name){
		super(name);
	}
	
	@Override
	public void run(){
		/*
		 * 1�������synchronized����run������û���κ�Ч��
		 * 2��������ܹ��̳��������̵߳Ļ��������synchronized�����θ�����ķ�����û���κ�Ч��
		 * */
		while(true){
			//��֤����1
//				if(cnt > 0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "�۳���Ʊ���Ϊ��" + cnt--);
//				}else{
//					break;
//				}
			//��֤����2
			if(sale()){
				
			}else{
				break;
			}
		}
	}
	
	public synchronized boolean sale(){
		if(cnt > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "�۳���Ʊ���Ϊ��" + cnt--);
			return true;
		}else{
			return false;
		}
	}
}
