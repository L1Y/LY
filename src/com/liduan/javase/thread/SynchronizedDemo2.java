package com.liduan.javase.thread;

public class SynchronizedDemo2 {
	public static Object obj = new Object();
	public static void main(String[] args){
		method1();
		//method2();
	}
	
	static void method1(){
		CallMe1 target = new CallMe1();
		Caller1 c1 = new Caller1(target, "Hello");
		Caller1 c2 = new Caller1(target, "Synchronized");
		Caller1 c3 = new Caller1(target, "World");
		
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
	
	static void method2(){
		for(int i = 0; i < 10; i++){
			try{
				CallMe1 target = new CallMe1();
				Caller1 c1 = new Caller1(target, "Hello");
				c1.t.join();
				Caller1 c2 = new Caller1(target, "Synchronized");
				c2.t.join();//join��������һ����ʶ��䣬���ߴ����������̣߳��ڵȸ��߳̽����󣬲��ܼ������к���Ĵ���
				Caller1 c3 = new Caller1(target, "World");
				c3.t.join();
				/*	join�������ȴ�һ���߳���ֹ��Ȼ�����ִ�к���Ĵ��롣����������߳���run�����еĴ���ִ��˳��
				 * 			
				 * */
				System.out.println("��Ľ�����");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class CallMe1{
	//synchronized ��������ֵ���� ��������
	/*synchronized*/ void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Caller1 implements Runnable{
	String msg;
	CallMe1 target;
	Thread t;
	
	public Caller1(CallMe1 target, String msg){
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		//System.out.println(msg + "before");
		
		//��׼д�����Ƽ���������
//		synchronized(target){
//			target.call(msg);			
//		}

		//System.out.println(msg + "after");
		//synchronized(Object object)object��������ͬ���������object�ĵ�ַ�����ı䣬����Ҳ�ı�
		synchronized(A.str){
//			System.out.print("[" + msg);
//			try{
//				Thread.sleep(1000);
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
//			System.out.println("]");
			target.call(msg);
		}
	}
	
}

class A{
	public static String str = "str";
}
