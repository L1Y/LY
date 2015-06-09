package com.lizhenglin.javase.review;

//如果class被public修饰的话，就必须跟java文件名保持一致。
//一个类文件里面，只能有一个class被public修饰。

public class Triangle extends Shape
{
  // 定义一个属性：修饰符 类型 变量名称
  private String name;
  private double base;
  private double height;

  /**
   * 构造方法 1、构造的名称与类同名 2.构造方法没有返回值
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
