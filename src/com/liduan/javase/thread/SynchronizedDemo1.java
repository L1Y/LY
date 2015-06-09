package com.liduan.javase.thread;

public class SynchronizedDemo1 {
	public static void main(String[] args){
		method1();
		method2();
	}
	
	static void method1(){
		for(int i = 0; i < 10; i++){
			CallMe target = new CallMe();
			Caller c1 = new Caller(target, "Hello");
			Caller c2 = new Caller(target, "Synchronized");
			Caller c3 = new Caller(target, "World");
			
			try{
				/*	join�������ȴ�һ���߳���ֹ��Ȼ�����ִ�к���Ĵ��롣����������߳���run�����еĴ���ִ��˳��
				 * */
				c1.t.join();
				c2.t.join();
				c3.t.join();
				System.out.println("��Ľ�����");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	static void method2(){
		for(int i = 0; i < 10; i++){
			try{
				CallMe target = new CallMe();
				Caller c1 = new Caller(target, "Hello");
				c1.t.join();
				Caller c2 = new Caller(target, "Synchronized");
				c2.t.join();
				Caller c3 = new Caller(target, "World");
				c3.t.join();
				/*	join�������ȴ�һ���߳���ֹ��Ȼ�����ִ�к���Ĵ��롣����������߳���run�����еĴ���ִ��˳��
				 * */
				System.out.println("��Ľ�����");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class CallMe{
	void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	String msg;
	CallMe target;
	Thread t;
	
	public Caller(CallMe target, String msg){
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		target.call(msg);
	}
	
}
