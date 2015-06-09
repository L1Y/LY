package com.hufeng.javase0606.thread;

public class MyThread extends Thread{
	
	@Override
	public void run(){
		int i;
		for(i=1;i<=10000000;i++){
			System.out.println("Game Over:::" + i);
		}
		
	}
public static void main(String[] args){
	MyThread mt = new MyThread();
	mt.start();
	mt.new MyTtreadOne().start();
	
	mt.getPriority();
}
class MyTtreadOne extends Thread{
	@Override
	public void run(){
		int j=1;
		while(true){
			j++;
			System.out.println("GG:" + j);
		}
		
	}
public void main(String[] args){
	MyTtreadOne mt = new MyTtreadOne();
	mt.run();
}
}
}

