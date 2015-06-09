package com.jiangmin.javase.inherit;

public class AdapterDemo {

	public static void main(String[] args) {
		AdapterDemo ad = new AdapterDemo();
		InheritBaseAdapter iba = new InheritBaseAdapter();
		iba.initArray();
		
		ad.Iterator(iba);
	}

	public void Iterator(BaseAdapter adapter){
		for(int i = 0; i < adapter.getCount(); i++){
			adapter.getView(i);
		}
	}
}
