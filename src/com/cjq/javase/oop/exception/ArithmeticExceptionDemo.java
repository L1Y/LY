package com.cjq.javase.oop.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("�����������");
    int divisor = in.nextInt();
    System.out.print("�����뱻������");
    int dividend = in.nextInt();

    int[] array = new int[] { 1, 2, 3 };

    try {
      System.out.println(divisor + " / " + dividend + " = " + divisor
          / dividend);

      System.out.println(array[3]);

    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("����������Ϊ0��");
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("�������Խ�磡");
    } finally {
      in.close();
    }

  }

}
