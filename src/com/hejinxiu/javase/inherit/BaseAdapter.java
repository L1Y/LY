package com.hejinxiu.javase.inherit;

public abstract class BaseAdapter {
	
	public abstract int getCount();
	/*
	 * ����һ��Object��ֵ�����Ǵ�����Է����κε���ʽ
	 */
	public abstract Object getItem(int position);
	public abstract void getView(int position);
	
}
