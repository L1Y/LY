package com.tuyongkang.javase.BaseAdapter;

public class AdapterDemo {
//	private BaseAdapter adapter;
	
	
	public static void main(String[] args){
		AdapterDemo adapter = new AdapterDemo();
		ArrayaAdapter array = new ArrayaAdapter();
		adapter.iterator(array);
	}
	
	public void iterator(ArrayaAdapter adapter){
		adapter.initarray();
		for(int i = 0; i<adapter.getCount();i++){
			adapter.getView(i);
		}
	}
	

}

	