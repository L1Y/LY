package com.cjq.javase.oop.progress;

public class MyTest {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getPriority());

    /*MyThread mt = new MyThread();
    mt.setPriority(9);
    MyRunnable mr = new MyRunnable();

    new Thread(mr).start();
    // System.out.println("*******************");
    mt.start();*/
  }

}
