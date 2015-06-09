package com.cjq.javase.exam;

import java.util.Scanner;

/**
 * 这是一个输出输出对等数等腰三角形的类。
 * 
 * @author i_Mjunqi
 *
 */
public class IsoscelesTriangle {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("请问您想输出多少行？");
    int n = in.nextInt();
    in.close();
    System.out.println("************************************");
    for (int i = 1; i <= n; i++) {
      printSpace(n - i);
      if (n >= 10) {
        if (i < 10) {
          printSpace(n - 1);
        } else if (i < n) {
          printSpace(n - i);
        }
      }
      int j = 0;
      for (; j < i - 1; j++) {
        System.out.print(i);
      }
      System.out.print(i - 1);
      for (j++; j < 2 * i - 1; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void printSpace(int n) {
    while (n != 0) {
      System.out.print(" ");
      n--;
    }
  }

}
