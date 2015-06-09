package com.yyw.javase.inherit;

public class MyAdapter extends BaseAdapter {
	private int[] arr = new int[10];
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	MyAdapter(){
		for (int i=0;i<10;i++){
			arr[i] = i;
		}
	}
	
	
	
	@Override
	int getCount() {
		return arr.length;
	}

	@Override
	int getItem(int position) {
		return arr[position];
	}

	@Override
	void getView(int position) {
		System.out.println(arr[position]);
	}

}
