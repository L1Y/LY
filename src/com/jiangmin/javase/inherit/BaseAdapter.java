package com.jiangmin.javase.inherit;

public abstract class BaseAdapter {
	public abstract int getCount();
	
	public abstract Object getItem(int position);
	
	public abstract void getView(int position);
}
