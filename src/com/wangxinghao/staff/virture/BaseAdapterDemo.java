package com.wangxinghao.staff.virture;

public class BaseAdapterDemo {

	public void Interator(BaseAdapter bb) {
		for (int i = 0; i < bb.getCount(); i++) {
			bb.getView(i);

		}
	}

	public static void main(String[] args) {
		int[] suzu = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		BaseAdapterDemo baseAdapterDemo = new BaseAdapterDemo();
		MyBaseAdapter adapter = new MyBaseAdapter(suzu);

		baseAdapterDemo.Interator(adapter);

	}
}
