package com.guzhijie.javase.thread;

public class GuThread extends Thread{
	@Override
	public void run(){
		//System.out.println("first thread");
		while(true){
			System.out.println("1");
		}
	 	
	}
	public static void main(String[] args){
		GuThread gu = new GuThread();
		GuThreadTwo gu2 = new GuThreadTwo();
		gu.start();
		
		//gu2.start();
	}
}
class GuThreadTwo extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 10000; i++){
			System.out.println("µ¹ÊýµÚ" + (9999-i) + "´Î");
		}
}
}
	