package com.muxiaohan.javase.inherit;

public class AdapterDemo {

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		Iterator(ad);
	}
	
	public static  void Iterator(ArrayDemo ad){
		for(int i = 0 ; i < ad.getCount(); i++){
			ad.getView(i);
			//System.out.println(ad.getItem(i));
		}
	}

}
