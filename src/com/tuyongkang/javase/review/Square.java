package com.tuyongkang.javase.review;

public class Square
{
  private int width;// ��
  private int height;// ��

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
  public int getArea()
  {
    return width * height;
  }

}
