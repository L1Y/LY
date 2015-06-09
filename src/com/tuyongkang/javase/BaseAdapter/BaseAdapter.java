package com.tuyongkang.javase.BaseAdapter;

/**
 * 
 * @author tuyongkang
 *
 */

abstract class BaseAdapter {
    /**
     * 
     * @return
     */
	public abstract int getCount();
	/**
	 * 
	 * @param position
	 * @return
	 */
	public abstract int getItem(int position);
	/**
	 * 
	 * @param position
	 * @return
	 */
	public abstract void getView(int position);

}


