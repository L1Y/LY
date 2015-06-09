package com.xurui.javase.review;

public class AdapterDemo {
	public void iterator(BaseAdapter adapter){
		for(int i=0;i<adapter.getCount();i++){
			adapter.getView(i);
		}
	}
	
	public static void main(String [] args){
		AdapterDemo ada =new AdapterDemo();
		Adapter ad =new Adapter();
		ada.iterator(ad);
	}
	
}
