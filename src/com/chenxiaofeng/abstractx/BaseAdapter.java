package com.chenxiaofeng.abstractx;

public abstract class BaseAdapter {
	public abstract int getCount();
	
	public abstract int getItem(int position);
	
	public abstract void getView(int position);
}
