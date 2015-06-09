package com.cjq.javase.oop.inherit;

public class AdapterDemo {

  public static void Iterator(BaseAdapter adapter) {
    int length = adapter.getCount();
    for (int i = 0; i < length; i++) {
      adapter.getView(i);
    }
  }

  public static void main(String[] args) {

    ArrayBaseAdapter adapter = new ArrayBaseAdapter();
    Iterator(adapter);
    
  }

}
