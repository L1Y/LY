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
	public abstract int getItem(int position);//��ȡ�����е�һ��Ԫ��
	public abstract void getView(int position);
	
}
