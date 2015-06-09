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
			/*	join方法：等待一个线程终止，然后继续执行后面的代码。并不会干扰线程中run方法中的代码执行顺序
			 * */
			c1.t.join();
			c2.t.join();
			c3.t.join();
			System.out.println("真的结束了");
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
				c2.t.join();//join方法类似一个标识语句，告诉创建的它的线程，在等该线程结束后，才能继续运行后面的代码
				Caller1 c3 = new Caller1(target, "World");
				c3.t.join();
				/*	join方法：等待一个线程终止，然后继续执行后面的代码。并不会干扰线程中run方法中的代码执行顺序
				 * 			
				 * */
				System.out.println("真的结束了");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class CallMe1{
	//synchronized 方法返回值类型 方法名称
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
		
		//标准写法，推荐大家用这个
//		synchronized(target){
//			target.call(msg);			
//		}

		//System.out.println(msg + "after");
		//synchronized(Object object)object用来创建同步锁，如果object的地址发生改变，则锁也改变
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
