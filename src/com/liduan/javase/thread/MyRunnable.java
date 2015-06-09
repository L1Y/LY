package com.liduan.javase.thread;

/**
 * 
 * @author liduan
 *
 *	常见面试题：线程是通过run()方法启动还是start()方法
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("this is my first runnable class");
		int j = 0;
		while(j < 10){
			j++;
			System.out.println("j:" + j);
		}
	}
	
	public static void main(String[] args){
		MyRunnable mr = new MyRunnable();
		new Thread(mr).start();//线程是通过start方法启动
	}

}
