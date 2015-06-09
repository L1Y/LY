package com.cjq.javase.oop.inherit;

/**
 * 构造子类的时候，默认调用父类的无参构造方法
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
 * 子类的构造方法一定会调用父类的无参构造方法
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
    this(); // this关键字和super关键字，在构造方法里都只能存在第一行。
            // 有this的时候，该有参构造方法就没有super()，但在调用子类的无参时，无参里面又默认有一个super()。
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
