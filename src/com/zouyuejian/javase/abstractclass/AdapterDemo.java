package com.zouyuejian.javase.abstractclass;

public class AdapterDemo {
	public void Iterator(BaseAdapter adapter){
		for(int i = 0;i < adapter.getCount();i++){
			adapter.getView(i);
		}
	}
	
	public static void main(String[] args) {
		AdapterDemo adpDemo = new AdapterDemo();
		Adapter adp = new Adapter();
		adpDemo.Iterator(adp);
	}
}
