package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *1�������������̣߳�������һ�����1-100֮���ż������һ�����1-100֮���������
 *
 *����ȴ�ӡ�����ٴ�ӡż��
 */
public class PraticeDemo13 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//ͬ����������ͬһ����ַ
		MyPrint2 mp = new MyPrint2();
		J2 j1 = new J2(mp, 1);
		J2 j2 = new J2(mp, 2);
		j1.start();
		j2.start();
	}

}

class J2 extends Thread{
	MyPrint2 mp;
	int n = 0;
	
	public J2(MyPrint2 mp, int n){
		this.mp = mp;
		this.n = n;
	}
	
	@Override
	public void run() {
		mp.print(n);
	}
	
}

class MyPrint2{
	int num = 100;
	
	public void print(int n){
		System.out.println(n % 2 == 0 ? "ż��Ϊ��" : "����Ϊ��");
		for(int i = n; i <= num; i = i + 2){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}