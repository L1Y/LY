package com.wangzexin.javase.thread;

class Obb extends Thread{
	private int num;
	public Obb(){
		num = 0;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(num % 2 != 0)
				System.out.println("I am obb: " + num);
			if(num >= 100)
				return;
			else
				num++;
		}
	}
	
}

class Even extends Thread{
	private int num;
	public Even(){
		num = 0;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(num % 2 == 0)
				System.out.println("I am Even: " + num);
			if(num >= 100)
				return;
			else
				num++;
		}
	}
	
}

public class OutputNum {
	
	public static void main(String[] args){
		try {
			new Obb().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		new Even();
	}

}
