package com.zhenshuyu.javase.thead;

public class ThreadDemo  extends  Thread {
	public void run(){
		while (true) {
			System.out.println("123");
		}
	}
}
