package com.lizhenglin.javase.review;

//���class��public���εĻ����ͱ����java�ļ�������һ�¡�
//һ�����ļ����棬ֻ����һ��class��public���Ρ�

public class Triangle extends Shape
{
  // ����һ�����ԣ����η� ���� ��������
  private String name;
  private double base;
  private double height;

  /**
   * ���췽�� 1���������������ͬ�� 2.���췽��û�з���ֵ
   * 
   * @param height
   * @param width
   */
  public Triangle(double di, double height)
  {
    this.base = di;
    this.height = height;
  }

  public Triangle(String name, double di, double height)
  {
    this(di, height);
    this.name = name;
  }

  public double getArea()
  {
    return base * height / 2;
  }

  public double getArea(double di, double height)
  {
    return di * height / 2;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setBase(double di)
  {
    this.base = di;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public double getBase()
  {
    return base;
  }

  public double getHeight()
  {
    return height;
  }
}
