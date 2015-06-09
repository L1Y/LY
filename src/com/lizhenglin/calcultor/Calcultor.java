package com.lizhenglin.calcultor;

import java.util.Scanner;

public class Calcultor
{
  private int x;
  private int y;
  private String mark;

  public Calcultor()
  {
  }

  public Calcultor(int x, String mark, int y)
  {
    this.x = x;
    this.y = y;
    this.mark = mark;
  }

  public int getResult()
  {
    if ("+".equalsIgnoreCase(mark))
    {
      return x + y;
    } else if ("-".equalsIgnoreCase(mark))
    {
      return x - y;
    } else if ("*".equalsIgnoreCase(mark))
    {
      return x * y;
    } else
    {
      if (y == 0)
      {
        System.out.println("除数不能为零");
        return 0;
      } else
      {
        return x / y;
      }

    }
  }

  public boolean isNumber(String str)
  {
    int x = 0;
    while (x != str.length() - 1)
    {
      if (!(str.charAt(x) >= '0' && str.charAt(x) <= '9')) return false;
      x++;
    }
    return true;
  }

  public void jiSuan(String s)
  {
    while (x != s.length() - 1)
    {

    }

  }

  public void setX(int x)
  {
    this.x = x;
  }

  public int getX()
  {
    return this.x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public int getY()
  {
    return this.y;
  }

  public void setMark(String s)
  {
    this.mark = s;
  }

  public String getMark()
  {
    return mark;
  }
  
  /**
   * 判断是否是有效运算符
   * @param str 目标运算符
   * @return
   */
  public boolean isValidMark(String str)
  {
    // 尽量不要用逻辑运算符
    // if (!(str.equalsIgnoreCase("+") || str.equalsIgnoreCase("-")
    // || str.equalsIgnoreCase("*") || str.equalsIgnoreCase("/")))

    /*
     * if (str.equalsIgnoreCase("+")) { } else if (str.equalsIgnoreCase("+")) {
     * } else if (str.equalsIgnoreCase("*")) { } else if
     * (str.equalsIgnoreCase("/")) {
     * 
     * } else { return false; }
     */

    String[] array = {"+","-","*","/"};
    
    for(String itemString : array)
    {
      if(itemString.equalsIgnoreCase(str))
        return true;
    }
    return false;
    
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    System.out.println(new Calcultor().isNumber(s));
    
  }

}
