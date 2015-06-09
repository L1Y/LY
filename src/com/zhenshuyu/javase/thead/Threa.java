package com.zhenshuyu.javase.thead;

public class Threa {
	public static void main(String[] args){
		ThreadDemoTwo  th =new ThreadDemoTwo ();
	      th.start();	
	ThreadDemo  te=new ThreadDemo ();
		
		new Thread(te).start();
	}

}
