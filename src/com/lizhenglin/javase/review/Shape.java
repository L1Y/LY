package com.lizhenglin.javase.review;

public abstract class Shape
{
  protected String name;

  public abstract double getArea();

  
  public String getName()
  {
    return name;
  }

  protected void setName(String name)
  {
    this.name = name;

  }
}
