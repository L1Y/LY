package com.cjq.javase.oop.progress;

/**
 * 同步，用join方法解决
 * 
 * @author i_Mjunqi
 *
 */
public class ThreadDemo1 extends Thread {
  private int choice;

  @Override
  public void run() {
    for (int i = choice; i <= 100; i += 2) {
        System.out.print(i + ", ");
    }
    System.out.println();
  }

  public ThreadDemo1(int choice) {
    this.choice = choice;
  }

  public static void main(String[] args) {
    try {
      System.out.println("先打印偶数：");
      ThreadDemo1 td1 = new ThreadDemo1(2);
      td1.start();
      td1.join();
      System.out.println("**************");
      System.out.println("然后打印奇数：");
      ThreadDemo1 td2 = new ThreadDemo1(1);
      td2.start();
      td2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}