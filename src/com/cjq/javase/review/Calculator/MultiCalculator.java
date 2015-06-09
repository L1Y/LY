package com.cjq.javase.review.Calculator;

import java.util.Scanner;

/**
 * 可以输入整条式子的高级计算器。
 * 没有做错误判断，所以请输入正确的式子进行验证，比如 1+2+3 ，然后按回车键即可查看运行结果。
 * 无视乘除优先级...
 * 
 * @author i_Mjunqi
 *
 */
public class MultiCalculator {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("* * * * * * 高级计算器    * * * * * *");
    System.out.print("请输入要计算的式子：");
    String str = in.nextLine();

    Calculator cal = new Calculator();

    int length = str.length();
    int temp = 0;
    int result = 0;
    cal.setMark('+');
    for (int i = 0; i < length; i++) {
      if (cal.isMark(str.charAt(i))) {
        cal.setY(Integer.parseInt(str.substring(temp, i)));
        System.out.print(cal.getY() + " ");
        result = cal.getResult();
        cal.setX(result);
        cal.setMark(str.charAt(i));
        System.out.print(cal.getMark() + " ");
        temp = i + 1;
      }
    }
    
    cal.setY(Integer.parseInt(str.substring(temp, length)));
    System.out.print(cal.getY() + " ");
    result = cal.getResult();

    System.out.println("= " + result);

    in.close();

  }

}
