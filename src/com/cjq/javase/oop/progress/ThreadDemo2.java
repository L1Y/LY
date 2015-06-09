package com.cjq.javase.oop.progress;

/**
 * 同步，用synchronized关键字解决
 * 
 * @author i_Mjunqi
 *
 */
public class ThreadDemo2 extends Thread {
  private int choice;

  @Override
  public void run() {
    synchronized ("str") {
      System.out.println(choice % 2 == 0 ? "先打印偶数" : "再打印奇数");
      for (int i = choice; i <= 100; i += 2) {
        System.out.print(i + ", ");
      }
      System.out.println();
    }
  }

  public ThreadDemo2(int choice) {
    this.choice = choice;
  }

  public static void main(String[] args) {
    new ThreadDemo2(2).start();
    new ThreadDemo2(1).start();
  }

}
