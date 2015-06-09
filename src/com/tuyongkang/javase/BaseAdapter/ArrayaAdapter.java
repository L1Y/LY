package com.tuyongkang.javase.BaseAdapter;


class ArrayaAdapter extends BaseAdapter{

	/**
	 * 定义数组
	 */
	private int[] array = new int[10] ;
	
	public void initarray(){
		for(int i = 0;i < array.length;i++){
			array[i] = i;
		}
	}
	@Override
	public int getCount(){
		return array.length;
	}
	
	@Override
	public int getItem(int position){
		return array[position];
	}
	
	@Override
	public void getView(int position){
		System.out.print(getItem(position)+" ");
	}
	
}