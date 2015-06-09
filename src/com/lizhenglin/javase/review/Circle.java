package com.lizhenglin.javase.review;

//���class��public���εĻ����ͱ����java�ļ�������һ�¡�
//һ�����ļ����棬ֻ����һ��class��public���Ρ�

public class Circle extends Shape
{
  // ����һ�����ԣ����η� ���� ��������
  private String name;
  private double radius;
  private final double PI = 3.14;

  /**
   * ���췽�� 1���������������ͬ�� 2.���췽��û�з���ֵ
   * 
   * @param height
   * @param width
   */
  public Circle(double radius)
  {
    this.radius = radius;
  }

  public Circle(String name, double radius)
  {
    this(radius);
    this.name = name;
  }

  public double getArea()
  {
    return radius * radius * PI;
  }

  public double getArea(double radius)
  {
    return radius * radius * PI;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }
}
