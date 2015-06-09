package com.cjq.javase.oop.exception;

import java.util.Scanner;

/**
 * try��Ƕ��
 * 
 * @author i_Mjunqi
 *
 */
public class NestTry {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("�����������");
    int divisor = in.nextInt();
    System.out.print("�����뱻������");
    int dividend = in.nextInt();

    try {
      System.out.println(divisor + " / " + dividend + " = " + divisor
          / dividend);

    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("����������Ϊ0��");
      try {
        int[] array = new int[] { 1, 2, 3 };
        System.out.println(array[3]);
      } catch (ArrayIndexOutOfBoundsException ee) {
        ee.printStackTrace();
        System.out.println("�������Խ�磡");
      }
    } finally {
      in.close();
    }
  }

}
