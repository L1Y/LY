package com.starlight.javase.OOP;

public class InheritBArray extends BaseAdapter {
      
      int array[] ={3,5,8,2,6,9,1,2,4,7};

      @Override
      public int getCount() {
            // TODO �Զ����ɵķ������
            return 0;
      }

      @Override
      public Object getItem(int position) {
            // TODO �Զ����ɵķ������
            return null;
      }

      @Override
      public Object getView(int position) {
            // TODO �Զ����ɵķ������
            System.out.print(" " + array[position] + " ");
            return null;
      }
      

}
