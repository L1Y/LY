package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *1�������������̣߳�������һ�����1-100֮���ż������һ�����1-100֮���������
 */
public class PraticeDemo12 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//ͬ����������ͬһ����ַ
		MyPrint1 mp = new MyPrint1(1);
		MyPrint1 mp1 = new MyPrint1(2);
		J1 j1 = new J1(mp);
		J1 j2 = new J1(mp1);
		j1.start();
		try {
			j1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		j2.start();
	}

}

class J1 extends Thread{
	MyPrint1 mp;
	
	public J1(MyPrint1 mp){
		this.mp = mp;
	}
	
	@Override
	public void run() {
		mp.print();
	}
	
}

class MyPrint1{
	int num = 100;
	int n = 0;
	
	public MyPrint1(int n){
		this.n = n;
	}
	
	public void print(){
		System.out.println(n % 2 == 0 ? "ż��Ϊ��" : "����Ϊ��");
		for(int i = n; i <= num; i = i + 2){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}