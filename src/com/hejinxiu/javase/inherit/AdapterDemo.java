package com.hejinxiu.javase.inherit;

public class AdapterDemo {

	/**
	 * BaseAdapter Adapter ʲô���ģ�
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
		 * ���New Adapter��ʲô���ģ�
		 */
		s.Iterator(new Adapter());
	}
}
