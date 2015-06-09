package com.cjq.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    try {
      System.out.print("�����������");
      int num1 = in.nextInt();
      System.out.print("�����뱻������");
      int num2 = in.nextInt();
      System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    } catch (InputMismatchException e) { // С��Χ��Ҫ����ǰ��
      // e.printStackTrace();
      System.out.println(e.toString());
    } catch (Exception e) {
      System.out.println("�������󣬳����ж�...");
      System.out.println(e.toString());
    } finally {
      System.out.println("�����˳�����ӭ�ٴ�ʹ�ã�");
    }

    in.close();
  }
}
