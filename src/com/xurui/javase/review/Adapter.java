package com.xurui.javase.review;

public class Adapter extends BaseAdapter {
	int [] array = {1,2,3,4,5,6,7,8,9,10};
	int position = array.length;
	
	public void getView(int position){
		System.out.println(array[position]);
	}
	
	public int getCount(){
		return array.length;
	}
	
	public int getItem(int position){
		return array[position];
	}
}
