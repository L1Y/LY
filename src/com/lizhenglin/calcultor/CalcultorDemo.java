package com.lizhenglin.calcultor;

import java.util.Scanner;

public class CalcultorDemo
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    // 计算两个数字的加减乘除运算 。例：输入：58*47，再按回车
    String k = "";
    int i = -1, y = -1;
    String mark = "";
    int t = s.length();
    for (int x = 0; x < t; x++)
    {
      if (Character.isDigit(s.charAt(x)))
      {
        k += s.charAt(x);
        if (x == t - 1)
        {
          y = Integer.parseInt(k);
        }
      } else
      {
        i = Integer.parseInt(k);
        k = "";
        mark = s.charAt(x) + "";
      }
    }
    System.out.println(new Calcultor(i, mark, y).getResult());

    
    scanner.close();
  }
}
