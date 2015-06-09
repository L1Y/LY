/**
 * 
 */
package com.chenxuanxi.javase.override;

/**
 * @author Daniel Chan
 *
 */
public class BaseAdapterEx extends BaseAdapter {
	private int array[]={1,2,3,4,5,6,7,8,9,10};//��������
	/**
	 * ��ȡ����ĳ���
	 * ���� Javadoc��
	 * @see classtest.BaseAdapter#getCount()
	 */
	@Override
	public int getCount(){
		return array.length;
	}
		/**
		 * ��ȡ������ָ��λ�õ�����
		 * ���� Javadoc��
		 * @see classtest.BaseAdapter#getItem(int)
		 */
	@Override
	public int getItem(int position){
		return array[position];
	}
		/**
		 * ���������ָ��λ�õ�����
		 * ���� Javadoc��
		 * @see classtest.BaseAdapter#getView(int)
		 */
	@Override
	public void getView(int position){
			System.out.println(array[position]);
	}
}
