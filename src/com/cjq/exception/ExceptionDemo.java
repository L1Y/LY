package com.cjq.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    try {
      System.out.print("请输入除数：");
      int num1 = in.nextInt();
      System.out.print("请输入被除数：");
      int num2 = in.nextInt();
      System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    } catch (InputMismatchException e) { // 小范围的要放在前面
      // e.printStackTrace();
      System.out.println(e.toString());
    } catch (Exception e) {
      System.out.println("输入有误，程序中断...");
      System.out.println(e.toString());
    } finally {
      System.out.println("程序退出，欢迎再次使用！");
    }

    in.close();
  }
}
