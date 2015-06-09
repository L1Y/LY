package com.liduan.javase.inherit;

public class MyBaseAdapter extends BaseAdapter{
	private int[] array = new int[10];
	
	public MyBaseAdapter(){
		initArray();
	}
	
	public void initArray(){
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
	}
	
	@Override
	public int getCount() {
		return array.length;
	}

	@Override
	public int getItem(int pos) {
		return array[pos];
	}

	@Override
	public void getView(int pos) {
		System.out.println(getItem(pos));
	}
	
}
