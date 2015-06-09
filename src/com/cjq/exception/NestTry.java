package com.cjq.exception;

import java.util.Scanner;

/**
 * try的嵌套
 * 
 * @author i_Mjunqi
 *
 */
public class NestTry {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("请输入除数：");
    int divisor = in.nextInt();
    System.out.print("请输入被除数：");
    int dividend = in.nextInt();

    try {
      System.out.println(divisor + " / " + dividend + " = " + divisor
          / dividend);

    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("被除数不能为0！");
      try {
        int[] array = new int[] { 1, 2, 3 };
        System.out.println(array[3]);
      } catch (ArrayIndexOutOfBoundsException ee) {
        ee.printStackTrace();
        System.out.println("数组访问越界！");
      }
    } finally {
      in.close();
    }
  }

}
