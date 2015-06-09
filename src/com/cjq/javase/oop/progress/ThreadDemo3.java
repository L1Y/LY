package com.cjq.javase.oop.progress;

/**
 * 模拟火车站售票程序，开启三个窗口售票直到将100张票售完为止。
 * 
 * @author i_Mjunqi
 *
 */
public class ThreadDemo3 {

  public static void main(String[] args) {
    Ticketoffice td1 = new Ticketoffice("窗口一");
    td1.start();
    Ticketoffice td2 = new Ticketoffice("窗口二");
    td2.start();
    Ticketoffice td3 = new Ticketoffice("窗口三");
    td3.start();
  }

}

class Ticketoffice extends Thread {
  private static int cnt = 100;

  @Override
  public void run() {
    while (cnt > 0) {
      synchronized ("str") {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        if (cnt > 0) {
          System.out.println(Thread.currentThread().getName() + "售出编号为："
              + cnt--);
        } else {
          break;
        }
      }
    }
  }

  public Ticketoffice(String name) {
    super(name);
  }

}
