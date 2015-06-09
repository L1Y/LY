/**
 * 
 */
package com.chenxuanxi.javase.override;

/**
 * @author Daniel Chan
 *
 */
public abstract class BaseAdapter {
	
	public abstract int getCount();
	public abstract int getItem(int position);//获取集合中的一个元素
	public abstract void getView(int position);
	
}
