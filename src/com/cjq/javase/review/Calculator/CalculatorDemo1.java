package com.cjq.javase.review.Calculator;

import java.util.Scanner;

/**
 * 可以连续运算的计算器。
 * 已进行所有错误输入的判断，请放心使用。
 * 
 * @author i_Mjunqi
 *
 */
public class CalculatorDemo1 {

  public static void main(String[] args) {

    Calculator cal = new Calculator();

    System.out.println("* * * * * * 我的计算器    * * * * * *");
    boolean isSetX = false;

    while (true) {

      Scanner in = new Scanner(System.in);

      String str1;
      while (!isSetX) {
        System.out.print("x = ");
        str1 = in.nextLine();
        while (str1.length() != 0 && !cal.isNumberic(str1)) {
          System.out.println("输入有误，请重新输入一个纯数字的x值！");
          System.out.print("x = ");
          str1 = in.nextLine();
        }

        if (str1.length() == 0) {
          System.out.println("x不能为空，请重新输入！");
        } else {
          isSetX = true;
          cal.setX(Integer.parseInt(str1));
        }
      }

      System.out.print("运算符：");
      char c = in.next().charAt(0);
      while (!cal.isMark(c)) {
        System.out.print("输入有误，请重新正确的运算符：");
        c = in.next().charAt(0);
      }
      cal.setMark(c);

      String str2;
      out2: while (true) {
        System.out.print("y = ");
        str2 = in.next();
        while (str2.length() != 0 && !cal.isNumberic(str2)) {
          System.out.println("输入有误，请重新输入一个纯数字的y值！");
          System.out.print("y = ");
          str2 = in.next();
        }
        if (str2.length() == 0) {
          System.out.println("y不能为空，请重新输入！");
        } else {
          if (cal.getMark() == '/' && str2.charAt(0) == '0') {
            System.out.println("算术运算中，除数不能为0，请重新输入y的值！ ");

          } else {
            break out2;
          }
        }
      }
      cal.setY(Integer.parseInt(str2));

      System.out.println(cal.getX() + " " + cal.getMark() + " " + cal.getY()
          + " = " + cal.getResult());
      cal.setX(cal.getResult());

      System.out.print("计算完毕，是否退出程序？(q/Q)");
      String str3 = in.next();
      if (str3.equalsIgnoreCase("Q")) {
        break;
      } else {
        System.out.print("是否重新启动程序？(c/C)");
        String str4 = in.next();
        if (str4.equalsIgnoreCase("C")) {
          isSetX = false;
          System.out.println("重置成功！");
          System.out.println("* * * * * * * * * * * * * * * * *");
        } else {
          System.out.println("* * * * * * * * * * * * * * * * *");
          System.out.println("x = " + cal.getX());
        }

      }

    }

    System.out.println("程序已退出，感谢使用！");

  }

}
