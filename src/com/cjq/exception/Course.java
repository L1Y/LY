package com.cjq.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Course {

  private static final Logger log = Logger.getLogger(Course.class.getName());

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("������1~3֮������һ�����֣�");

    try {
      int choice = in.nextInt();
      log.debug("��������" + choice); // ��¼�ؼ�����
      switch (choice) {
      case 1:
        System.out.print("�γ�" + choice + "Ϊ��");
        System.out.println("Java�������");
        break;
      case 2:
        System.out.print("�γ�" + choice + "Ϊ��");
        System.out.println("Java EE Web���� ");
        break;
      case 3:
        System.out.print("�γ�" + choice + "Ϊ��");
        System.out.println("Android��Ŀʵս");
        break;
      default:
        /*
         * System.out.println("����������ֲ���1~3�У���ѯʧ��..."); break;
         */
        log.error("����������ֲ���1~3��"); // ��¼�������쳣
        throw new Exception("����������ֲ���1~3�У���ѯʧ��...");
      }
    } catch (Exception e) {
      System.out.println("�������󣬳����ж�...");
      System.out.println(e.getMessage());
      log.debug(e.toString()); // ��¼�쳣��Ϣ
    } finally {
      System.out.println("*******************************");
      System.out.println("����ִ����ϣ���ӭ������飡");
    }

    in.close();

  }

}
