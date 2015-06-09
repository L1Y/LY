package com.liduan.javase.thread;

/**
 * 
 * @author Administrator
 *
 *2，模拟火车站售票程序，开启三个窗口售票直到将100张票售完为止。
 */
public class PriticeDemo22 {
	public static Object obj = new Object();
	public static void main(String[] args) {
		//验证理论2
//		new SaleTicket1("窗口一").start();
//		new SaleTicket1("窗口二").start();
//		new SaleTicket1("窗口三").start();
		//理论2纠证方法
		SaleTicket1 st = new SaleTicket1("");
		new Thread(st, "窗口一").start();
		new Thread(st, "窗口二").start();
		new Thread(st, "窗口三").start();
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
		 * 1，如果用synchronized修饰run方法，没用任何效果
		 * 2，如果是能过继承来创建线程的话，如果用synchronized来修饰该类里的方法，没有任何效果
		 * */
		while(true){
			//验证理论1
//				if(cnt > 0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "售出车票编号为：" + cnt--);
//				}else{
//					break;
//				}
			//验证理论2
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
			System.out.println(Thread.currentThread().getName() + "售出车票编号为：" + cnt--);
			return true;
		}else{
			return false;
		}
	}
}
