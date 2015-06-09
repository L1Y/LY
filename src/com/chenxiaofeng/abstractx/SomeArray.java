package com.chenxiaofeng.abstractx;

public class SomeArray extends BaseAdapter {
	
	private int[] array;
	
	public SomeArray(){
		array=new int[]{1,2,3,4,5,6,7,8,9,0};
	}
	
	public int getCount() {
		return array.length;
	}

	public int getItem(int position) {
		return array[position];
	}

	public void getView(int position) {
		System.out.print(array[position]);
	}
}
