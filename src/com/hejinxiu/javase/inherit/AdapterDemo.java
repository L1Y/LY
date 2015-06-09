package com.hejinxiu.javase.inherit;

public class AdapterDemo {

	/**
	 * BaseAdapter Adapter 什么来的？
	 * @param Adapter
	 */
	public void Iterator(BaseAdapter Adapter) {

		for (int i = 0; i < 10; i++) {
			Adapter.getView(i);
		}
	}

	public static void main(String[] args) {
		AdapterDemo s = new AdapterDemo();
		
		/**
		 * 这个New Adapter是什么来的？
		 */
		s.Iterator(new Adapter());
	}
}
