package com.lizhenglin.javase.review;

public class Square extends Shape
{
  private double width;// 宽
  private double height;// 高

  public Square()
  {
    width = 15;
    height = 20;
  }

  public Square(int w, int h)
  {
    width = w;
    height = h;
  }

  /**
   * 获取面积
   * 
   * @return
   */
  public double getArea()
  {
    return width * height;
  }

}
