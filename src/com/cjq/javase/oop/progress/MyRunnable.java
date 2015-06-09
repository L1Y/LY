package com.cjq.javase.oop.progress;

public class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("This is my first Runnable. ");
    int i = 0;
    while (i < 10) {
      System.out.println("MyRunnable : " + i);
      i++;
      /*try {
        Thread.sleep(10);
        
      } catch (InterruptedException e) {

        e.printStackTrace();
      }*/
    }
  }

  public static void main(String[] args) {
    MyRunnable mr = new MyRunnable();
    new Thread(mr).start();
  }
}
