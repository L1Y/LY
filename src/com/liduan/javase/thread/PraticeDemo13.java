package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *1，创建两个子线程，让其中一个输出1-100之间的偶数，另一个输出1-100之间的奇数。
 *
 *如何先打印奇数再打印偶数
 */
public class PraticeDemo13 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//同步锁必须是同一个地址
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
		System.out.println(n % 2 == 0 ? "偶数为：" : "奇数为：");
		for(int i = n; i <= num; i = i + 2){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}