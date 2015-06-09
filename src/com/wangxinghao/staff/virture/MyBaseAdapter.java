package com.wangxinghao.staff.virture;

public class MyBaseAdapter extends BaseAdapter {

	int[] suzu = new int[10];
	int len;

	public MyBaseAdapter(int[] suzu) {
		super();
		this.suzu = suzu;
		len = suzu.length;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return len;
	}

	@Override
	public Object getItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getView(int position) {

		System.out.println(suzu[position]);
		return null;
	}

}
