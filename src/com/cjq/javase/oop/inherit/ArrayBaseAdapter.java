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
   * ��������ĳ���
   */
  @Override
  public int getCount() {
    return array.length;
  }

  /**
   * ����positionλ�õ�����Ԫ��
   */
  @Override
  public int getItem(int position) {
    return array[position];
  }
  
  /**
   * ��ʾpositionλ�õ�����(�������Ǵ�ӡ��ʾ)
   */
  @Override
  public void getView(int position) {
    System.out.print(array[position] + "  ");
  }

}
