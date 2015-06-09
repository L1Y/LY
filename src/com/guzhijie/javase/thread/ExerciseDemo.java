package com.guzhijie.javase.thread;

public class ExerciseDemo {

	public static void main(String[] args) {
		Testout tagret = new Testout();
		OddEven t1 = new OddEven(tagret,1);
		OddEven t2 = new OddEven(tagret,2);
	}
}
class Testout{
	void out(int temp){
		if(temp == 1){
			for(int i = 0; i < 50; i++){
				System.out.println("1~100之间的奇数:" + (2*i+1));
			}
		}else if(temp == 2){
			for(int i = 0; i <= 50; i++){
				System.out.println("1~100之间的偶数:" + 2*i);
			}
		}
	}
}
class OddEven implements Runnable{
	private int temp;
	Thread t;
	Testout tagret;
	
	public OddEven(Testout tagret,int temp){
		this.temp = temp;
		this.tagret = tagret;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized (tagret) {
			tagret.out(temp);
		}
		}
	}


