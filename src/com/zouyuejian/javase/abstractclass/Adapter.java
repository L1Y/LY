package com.zouyuejian.javase.abstractclass;

public class Adapter extends BaseAdapter {
	private int[] obj = new int[10];
	public void initObj(){
		for(int i = 0; i < obj.length; i++){
			obj[i] = i;
		}
	}
	
	public Adapter(){
		initObj();
	}
	
	@Override
	public int getCount(){
		return obj.length;
	}
	
	@Override
	public int getItem(int position){
		return obj[position];
	}
	
	@Override
	public void getView(int position){
		System.out.println(getItem(position));
	}
}
