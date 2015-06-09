package com.liduan.javase.inherit;

public class AdapterDemo {

	public static void main(String[] args) {
		AdapterDemo ad = new AdapterDemo();
		MyBaseAdapter adapter = new MyBaseAdapter();
		ad.Iterator(adapter);
	}
	
	public void Iterator(BaseAdapter adapter){
		for(int i = 0; i < adapter.getCount(); i++){
			adapter.getView(i);
		}
	}

}
