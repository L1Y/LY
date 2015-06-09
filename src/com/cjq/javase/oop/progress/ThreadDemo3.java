package com.cjq.javase.oop.progress;

/**
 * ģ���վ��Ʊ���򣬿�������������Ʊֱ����100��Ʊ����Ϊֹ��
 * 
 * @author i_Mjunqi
 *
 */
public class ThreadDemo3 {

  public static void main(String[] args) {
    Ticketoffice td1 = new Ticketoffice("����һ");
    td1.start();
    Ticketoffice td2 = new Ticketoffice("���ڶ�");
    td2.start();
    Ticketoffice td3 = new Ticketoffice("������");
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
          System.out.println(Thread.currentThread().getName() + "�۳����Ϊ��"
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
