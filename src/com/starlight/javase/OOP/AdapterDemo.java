package com.starlight.javase.OOP;

public class AdapterDemo {
      

      public static void main(String[] args) {
            // TODO �Զ����ɵķ������
            AdapterDemo ad = new AdapterDemo();
            InheritBArray iba = new InheritBArray();
            ad.iterator(iba);

      }
      
      public void iterator(InheritBArray iba){
            int length = iba.array.length;
            for(int i = 0 ; i < length ; i++){
                  iba.getView(i);
            }
            
      }

}
