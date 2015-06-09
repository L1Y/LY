package com.muxiaohan.javase.inherit;

class ArrayDemo extends BaseAdapter{
	
	private int[] array = {1,4,2,3,6,3,8,0,5,7};
	@Override
	int getCount() {
		return getArray().length;
	}

	@Override
	int getItem(int position) {
		return getArray()[position];
	}

	@Override
	void  getView(int position) {
		// TODO Auto-generated method stub
		System.out.println(getArray()[position]);
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
}
