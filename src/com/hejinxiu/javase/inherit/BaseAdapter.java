package com.hejinxiu.javase.inherit;

public abstract class BaseAdapter {
	
	public abstract int getCount();
	/*
	 * 返回一个Object的值，就是代表可以返回任何的形式
	 */
	public abstract Object getItem(int position);
	public abstract void getView(int position);
	
}
