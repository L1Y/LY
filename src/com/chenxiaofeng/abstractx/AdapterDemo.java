package com.chenxiaofeng.abstractx;

public class AdapterDemo {
	
	public void Iterator(BaseAdapter adapter){
		for(int i=0;i<adapter.getCount();i++){
			adapter.getView(i);
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		new AdapterDemo().Iterator(new SomeArray());

	}

}
