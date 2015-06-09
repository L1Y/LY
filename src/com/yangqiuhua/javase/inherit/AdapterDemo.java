package com.yangqiuhua.javase.inherit;

public class AdapterDemo {
	
	public void Iterator(ExtendBaAda adapter){	
		for(int i = 0;i < adapter.getCount();i++){
			adapter.getView(i);
		}
	}

	public static void main(String[] args) {
		AdapterDemo ad = new AdapterDemo();
		ExtendBaAda ex =  new ExtendBaAda();
		ad.Iterator(ex);
	
	}

}
