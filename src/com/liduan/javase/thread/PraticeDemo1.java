package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *1�������������̣߳�������һ�����1-100֮���ż������һ�����1-100֮���������
 */
public class PraticeDemo1 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//ͬ����������ͬһ����ַ
		MyPrint mp = new MyPrint(1);
		MyPrint mp1 = new MyPrint(2);
		J j1 = new J(mp);
		J j2 = new J(mp1);
		j1.start();
		j2.start();
	}

}

class J extends Thread{
	MyPrint mp;
	
	public J(MyPrint mp){
		this.mp = mp;
	}
	
	@Override
	public void run() {
//		synchronized(PraticeDemo1.obj){
//			System.out.println(n % 2 == 0 ? "ż��Ϊ��" : "����Ϊ��");
//			for(int i = n; i <= num; i = i + 2){
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		mp.print();
	}
	
}

class MyPrint{
	int num = 100;
	int n = 0;
	
	public MyPrint(int n){
		this.n = n;
	}
	
	public synchronized void print(){
		System.out.println(n % 2 == 0 ? "ż��Ϊ��" : "����Ϊ��");
		for(int i = n; i <= num; i = i + 2){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}