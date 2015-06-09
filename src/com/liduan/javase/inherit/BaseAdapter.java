package com.liduan.javase.inherit;

public abstract class BaseAdapter {
	public abstract int getCount();
	public abstract int getItem(int pos);//获取数组或集合中的一个元素
	public abstract void getView(int pos);
}