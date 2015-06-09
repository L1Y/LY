package com.jiangmin.javase.inherit;

public class InheritBaseAdapter extends BaseAdapter {
	private int[] array = new int[10];
	
	public void initArray(){
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
	}
	
	@Override
	public int getCount(){
		return array.length;
	}
	
	@Override
	public Object getItem(int position){
		return array[position];
	}
	
	@Override
	public void getView(int position){
		System.out.println(array[position]);
	}
}
