package com.hejinxiu.javase.inherit;

public class Adapter extends BaseAdapter {
	
	public int[] array = {1,2,3,4,5,6,7,8,9,10};
	
	@Override
	public void getView(int position){
		System.out.print(array[position]);
		
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

}

