package com.cjq.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Course {

  private static final Logger log = Logger.getLogger(Course.class.getName());

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("请输入1~3之间任意一个数字：");

    try {
      int choice = in.nextInt();
      log.debug("输入数字" + choice); // 记录关键步骤
      switch (choice) {
      case 1:
        System.out.print("课程" + choice + "为：");
        System.out.println("Java程序设计");
        break;
      case 2:
        System.out.print("课程" + choice + "为：");
        System.out.println("Java EE Web开发 ");
        break;
      case 3:
        System.out.print("课程" + choice + "为：");
        System.out.println("Android项目实战");
        break;
      default:
        /*
         * System.out.println("您输入的数字不在1~3中，查询失败..."); break;
         */
        log.error("您输入的数字不在1~3中"); // 记录程序定义异常
        throw new Exception("您输入的数字不在1~3中，查询失败...");
      }
    } catch (Exception e) {
      System.out.println("输入有误，程序中断...");
      System.out.println(e.getMessage());
      log.debug(e.toString()); // 记录异常信息
    } finally {
      System.out.println("*******************************");
      System.out.println("程序执行完毕，欢迎提出建议！");
    }

    in.close();

  }

}
