package com.cjq.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("请输入除数：");
    int divisor = in.nextInt();
    System.out.print("请输入被除数：");
    int dividend = in.nextInt();

    int[] array = new int[] { 1, 2, 3 };

    try {
      System.out.println(divisor + " / " + dividend + " = " + divisor
          / dividend);

      System.out.println(array[3]);

    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("被除数不能为0！");
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("数组访问越界！");
    } finally {
      in.close();
    }

  }

}
