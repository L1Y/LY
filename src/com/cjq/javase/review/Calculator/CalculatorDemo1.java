package com.cjq.javase.review.Calculator;

import java.util.Scanner;

/**
 * ������������ļ�������
 * �ѽ������д���������жϣ������ʹ�á�
 * 
 * @author i_Mjunqi
 *
 */
public class CalculatorDemo1 {

  public static void main(String[] args) {

    Calculator cal = new Calculator();

    System.out.println("* * * * * * �ҵļ�����    * * * * * *");
    boolean isSetX = false;

    while (true) {

      Scanner in = new Scanner(System.in);

      String str1;
      while (!isSetX) {
        System.out.print("x = ");
        str1 = in.nextLine();
        while (str1.length() != 0 && !cal.isNumberic(str1)) {
          System.out.println("������������������һ�������ֵ�xֵ��");
          System.out.print("x = ");
          str1 = in.nextLine();
        }

        if (str1.length() == 0) {
          System.out.println("x����Ϊ�գ����������룡");
        } else {
          isSetX = true;
          cal.setX(Integer.parseInt(str1));
        }
      }

      System.out.print("�������");
      char c = in.next().charAt(0);
      while (!cal.isMark(c)) {
        System.out.print("����������������ȷ���������");
        c = in.next().charAt(0);
      }
      cal.setMark(c);

      String str2;
      out2: while (true) {
        System.out.print("y = ");
        str2 = in.next();
        while (str2.length() != 0 && !cal.isNumberic(str2)) {
          System.out.println("������������������һ�������ֵ�yֵ��");
          System.out.print("y = ");
          str2 = in.next();
        }
        if (str2.length() == 0) {
          System.out.println("y����Ϊ�գ����������룡");
        } else {
          if (cal.getMark() == '/' && str2.charAt(0) == '0') {
            System.out.println("���������У���������Ϊ0������������y��ֵ�� ");

          } else {
            break out2;
          }
        }
      }
      cal.setY(Integer.parseInt(str2));

      System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY()
          + " = " + cal.getResult());
      cal.setX(cal.getResult());

      System.out.print("������ϣ��Ƿ��˳�����(q/Q)");
      String str3 = in.next();
      if (str3.equalsIgnoreCase("Q")) {
        break;
      } else {
        System.out.print("�Ƿ�������������(c/C)");
        String str4 = in.next();
        if (str4.equalsIgnoreCase("C")) {
          isSetX = false;
          System.out.println("���óɹ���");
          System.out.println("* * * * * * * * * * * * * * * * *");
        } else {
          System.out.println("* * * * * * * * * * * * * * * * *");
          System.out.println("x = " + cal.getX());
        }

      }

    }

    System.out.println("�������˳�����лʹ�ã�");

  }

}
