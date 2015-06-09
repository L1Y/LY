package com.zhenshuyu.javase.thead;

public class Test extends Thread{
	public void run(){
		
	}
	
	public static void staticTest(){
		for (int i=0 ;i<1000;i++){
			new Thread(new Runnable(){
				@ Override
				public void run(){
					
				}
			}).start();
		}
	}

}
