package com.tuyongkang.javase.review;

public class Square
{
  private int width;// 宽
  private int height;// 高

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
  public int getArea()
  {
    return width * height;
  }

}
