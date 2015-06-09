package com.lizhenglin.javase.abstractDemo;

public class ArrayAdapter extends BaseAdapter
{
  private int position = 0;
  String[] s =
  { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

  @Override
  protected int getCount()
  {
    return s.length;
  }

  @Override
  protected Object getItem(int position)
  {
    this.position = position;
    return s[position];
  }

  @Override
  protected Object getView(int position)
  {
    this.position = position;
    return s[position];
  }

}
