/**
 * 
 */
package com.chenxuanxi.javase.override;

/**
 * @author Daniel Chan
 *
 */
public class BaseAdapterEx extends BaseAdapter {
	private int array[]={1,2,3,4,5,6,7,8,9,10};//定义数组
	/**
	 * 获取数组的长度
	 * （非 Javadoc）
	 * @see classtest.BaseAdapter#getCount()
	 */
	@Override
	public int getCount(){
		return array.length;
	}
		/**
		 * 获取数组中指定位置的数字
		 * （非 Javadoc）
		 * @see classtest.BaseAdapter#getItem(int)
		 */
	@Override
	public int getItem(int position){
		return array[position];
	}
		/**
		 * 输出数组中指定位置的数字
		 * （非 Javadoc）
		 * @see classtest.BaseAdapter#getView(int)
		 */
	@Override
	public void getView(int position){
			System.out.println(array[position]);
	}
}
