package com.liduan.javase.inherit;

public abstract class BaseAdapter {
	public abstract int getCount();
	public abstract int getItem(int pos);//��ȡ����򼯺��е�һ��Ԫ��
	public abstract void getView(int pos);
}