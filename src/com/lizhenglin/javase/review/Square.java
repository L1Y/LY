package com.lizhenglin.javase.review;

public class Square extends Shape
{
  private double width;// ��
  private double height;// ��

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
   * ��ȡ���
   * 
   * @return
   */
  public double getArea()
  {
    return width * height;
  }

}
