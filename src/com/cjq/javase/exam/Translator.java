package com.cjq.javase.exam;

import java.util.Scanner;

/**
 * һ���򵥵�Ӣ������ת������
 * 
 * @author i_Mjunqi
 *
 */
public class Translator {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    System.out.println("* * * * * * ��ӭʹ��Miniת���� * * * * * *\n");

    char choice = 'y';
    while (choice == 'y') {
      System.out.print("��������������ĵ�һ��Ӣ����ĸ��");
      char weather = in.next().charAt(0);

      switch (weather) {
      case 'D':
        System.out.println("����\n");
        break;
      case 'M':
        System.out.println("��ʪ\n");
        break;
      case 'H':
        System.out.println("����\n");
        break;
      case 'R':
        System.out.println("����\n");
        break;
      default:
        System.out.println("���������޷�ת����\n");
      }

      System.out.print("��������� (y/n) ");
      choice = c.next().charAt(0);
      while (choice != 'y' && choice != 'n') {
        System.out.print("��������������y��n��");
        choice = c.next().charAt(0);
      }
      System.out.println();
    }

    in.close();
    c.close();
    System.out.println("�˳�ϵͳ��");

  }

}
