package com.yangqiuhua.javase.inherit;

public class ExtendBaAda extends BaseAdapter{
	 int[] arr=new int[]{1,5,23,7,13,4,21,31,3,9};
	 
	 public ExtendBaAda(){
		 
	 }
	 
	 public int getCount(){
		 return arr.length;
	 }
	 
	 public int getItem(int position){
		 return arr[position];
	 }
	 
	 public void getView(int position){
		 System.out.println(arr[position]);
		 
		}
	 
	
	public static void main(String[] args) {
		
	}

}
