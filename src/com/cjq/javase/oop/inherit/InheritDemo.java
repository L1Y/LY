package com.cjq.javase.oop.inherit;

/**
 * ���������ʱ��Ĭ�ϵ��ø�����޲ι��췽��
 * 
 * @author i_Mjunqi
 *
 */

class Fu {

  int num;

  Fu() {
   // num = 10;
   // System.out.println("Fu" + num);
    show();
    System.out.println(this);
  }

  Fu(int f) {
    System.out.println("Fu" + f);
  }
  
  static void show(){
    System.out.println("fu show");
  }

}

/**
 * ����Ĺ��췽��һ������ø�����޲ι��췽��
 *
 */
class Zi extends Fu {
  // int num = 6;
  Zi() {
    num = 8;
//    System.out.println("Zi" + num);
//    System.out.println(super.num);
    System.out.println(this);
    super.show();
  }

  Zi(int z) {
    // super();
    this(); // this�ؼ��ֺ�super�ؼ��֣��ڹ��췽���ﶼֻ�ܴ��ڵ�һ�С�
            // ��this��ʱ�򣬸��вι��췽����û��super()�����ڵ���������޲�ʱ���޲�������Ĭ����һ��super()��
    System.out.println("Zi" + z);
  }
  
  // @Override
   static void show(){
    System.out.println("zi show" /*+ num*/);
  }

}

public class InheritDemo {

  public static void main(String[] args) {
//    Zi zi = new Zi();
    Zi.show();
  }

}
