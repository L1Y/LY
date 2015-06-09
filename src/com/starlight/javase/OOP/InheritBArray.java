package com.starlight.javase.OOP;

public class InheritBArray extends BaseAdapter {
      
      int array[] ={3,5,8,2,6,9,1,2,4,7};

      @Override
      public int getCount() {
            // TODO 自动生成的方法存根
            return 0;
      }

      @Override
      public Object getItem(int position) {
            // TODO 自动生成的方法存根
            return null;
      }

      @Override
      public Object getView(int position) {
            // TODO 自动生成的方法存根
            System.out.print(" " + array[position] + " ");
            return null;
      }
      

}
