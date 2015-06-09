package com.yyw.javase.inherit;

public class Adapter extends BaseAdapter {
	private int[] arr = new int[10];
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}



	Adapter(){
		for (int i=0;i<10;i++){
			arr[i] = i;
		}
	}
	
	
	
	@Override
	int getCount() {
		// TODO �Զ����ɵķ������
		return arr.length;
	}

	@Override
	int getItem(int position) {
		// TODO �Զ����ɵķ������
		return arr[position];
	}

	@Override
	void getView(int position) {
		// TODO �Զ����ɵķ������
		System.out.println(arr[position]);
	}

}
