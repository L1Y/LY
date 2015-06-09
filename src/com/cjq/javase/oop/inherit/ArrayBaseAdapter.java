package com.cjq.javase.oop.inherit;

import java.util.Random;

public class ArrayBaseAdapter extends BaseAdapter {

  private int[] array = new int[10];
  
  public ArrayBaseAdapter(){
    int length = array.length;
    for (int i = 0; i < length; i++) {
      array[i] = new Random().nextInt(99) + 1;
    }
  }
  
  /**
   * 返回数组的长度
   */
  @Override
  public int getCount() {
    return array.length;
  }

  /**
   * 返回position位置的数组元素
   */
  @Override
  public int getItem(int position) {
    return array[position];
  }
  
  /**
   * 显示position位置的数据(在这里是打印显示)
   */
  @Override
  public void getView(int position) {
    System.out.print(array[position] + "  ");
  }

}
