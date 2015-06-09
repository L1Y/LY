package com.fengdi.javase.abstraction;


public class AdapterDemo {

	public static void main(String[] args) {
		AdapterDemo A = new AdapterDemo();
		Subclass adapter = new Subclass();
		A.Iterator(adapter);
	}

	public void Iterator(Subclass adapter){
		for(int i = 0; i < adapter.getCount(); i++){
			adapter.getView(i);
		}
	}

}
