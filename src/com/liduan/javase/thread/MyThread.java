package com.liduan.javase.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("this is my first thread");
		int i = 0;
		while(i < 100){
			i++;
			System.out.println("i" + i);
		}
	}
	//main叫做主线程
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//mt.start();//start方法只是启动线程，但是什么时候去执行run方法里的代码块呢？要等到该线程抢到CPU的控制权才会执行
					//start方法只是告诉程序，可以被运行了，并不是一调用start方法就马上执行run方法里面的代码
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.setPriority(8);
		mt.start();
		t.start();
		//System.out.println("mt的优先级数：" + mt.getPriority());
		/*
		 * 如何让mr线程先启动？有很多因素，但把优先级数调高可以增加线程获取cpu控制权的概率
		 * */
		
	}

}
