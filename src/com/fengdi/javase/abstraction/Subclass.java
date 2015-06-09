package com.fengdi.javase.abstraction;

public  class Subclass extends BaseAdapter{
	
	int[] array = new int[10] ;

	
	public   Subclass(){
		for(int i=0 ; i<array.length;i++){
			array[i] = i ;
		}
	}
	public  int  getCount(){
		
		return array.length ;
	}
	
	public  int getItem(int position){
		return array[position];
	}
	
	public  void getView(int position){
		System.out.println(array[position]);
	}
	
}
