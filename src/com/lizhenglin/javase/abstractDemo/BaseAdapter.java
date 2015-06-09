package com.lizhenglin.javase.abstractDemo;

/**
 * @author lizhenglin
 *
 */
public abstract class BaseAdapter
{
  /**
   * 
   * @return
   */
  protected abstract int getCount();
  /**
   * 
   * @param position
   * @return
   */
  protected abstract Object getItem(int position);
  
  /**
   * 
   * @param position
   * @return
   */
  protected abstract Object getView(int position);
  
}
