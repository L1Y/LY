package com.yyw.javase.inherit;

public class AdapterDemo {

	public static void main(String[] args){
		MyAdapter adapter = new MyAdapter();
		Iterator(adapter);
	}
	
	static void Iterator(BaseAdapter adapter){
		for(int i = 0; i < adapter.getCount(); i++){
			adapter.getView(i);
		}
	}
}
