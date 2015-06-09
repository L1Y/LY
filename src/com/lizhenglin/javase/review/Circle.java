package com.lizhenglin.javase.review;

//如果class被public修饰的话，就必须跟java文件名保持一致。
//一个类文件里面，只能有一个class被public修饰。

public class Circle extends Shape
{
  // 定义一个属性：修饰符 类型 变量名称
  private String name;
  private double radius;
  private final double PI = 3.14;

  /**
   * 构造方法 1、构造的名称与类同名 2.构造方法没有返回值
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
