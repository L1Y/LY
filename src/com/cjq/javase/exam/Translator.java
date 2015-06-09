package com.cjq.javase.exam;

import java.util.Scanner;

/**
 * 一个简单的英中天气转换器。
 * 
 * @author i_Mjunqi
 *
 */
public class Translator {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    System.out.println("* * * * * * 欢迎使用Mini转换器 * * * * * *\n");

    char choice = 'y';
    while (choice == 'y') {
      System.out.print("请输入天气情况的第一个英文字母：");
      char weather = in.next().charAt(0);

      switch (weather) {
      case 'D':
        System.out.println("干燥\n");
        break;
      case 'M':
        System.out.println("潮湿\n");
        break;
      case 'H':
        System.out.println("炎热\n");
        break;
      case 'R':
        System.out.println("下雨\n");
        break;
      default:
        System.out.println("输入有误，无法转换！\n");
      }

      System.out.print("您想继续吗？ (y/n) ");
      choice = c.next().charAt(0);
      while (choice != 'y' && choice != 'n') {
        System.out.print("输入有误，请输入y或n：");
        choice = c.next().charAt(0);
      }
      System.out.println();
    }

    in.close();
    c.close();
    System.out.println("退出系统！");

  }

}
