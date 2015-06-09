package com.lizhenglin.calcultor;

import java.util.Scanner;

public class CalcultorDemo2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Calcultor c = new Calcultor();
    boolean setX = false;
    boolean setY = false;

    while (true)
    {
      String s = sc.next();
      if ("=".equalsIgnoreCase(s))
      {
        System.out.println(c.getX() + "" + c.getMark() + c.getY() + "="
            + c.getResult());

        c.setX(c.getResult());
        setY = false;
        c.setMark(null);
      } else if ("q".equalsIgnoreCase(s))
      {
        System.out.println("程序已退出，感谢使用.");
        sc.close();

        break;
      } else if ("c".equalsIgnoreCase(s))
      {
        System.out.println("重置成功.");

        setX = false;
        setY = false;
        c.setX(0);
        c.setY(0);
        c.setMark(null);
      } else
      {
        if (!setX && c.isNumber(s))
        {
          c.setX(Integer.valueOf(s));
          setX = true;
        }
        if (c.isValidMark(s))
        {
          c.setMark(s);
          setX = true;
        }
        if (!setY && c.getMark() != null && !c.isValidMark(s))
        {
          c.setY(Integer.valueOf(s));
          setY = true;
        }

      }

    }

  }
}
