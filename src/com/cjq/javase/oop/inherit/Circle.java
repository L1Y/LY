package com.cjq.javase.oop.inherit;

/**
 * 这是一个与圆形有关的类。
 * @author i_Mjunqi
 *
 */
public class Circle {
  
  private double r;
  private final double PI = 3.14;
  
  public Circle(double r){
    this.r = r;
  }
  
  /**
   * 求圆形的面积
   * @return
   */
  public double getArea(){
    return PI*r*r;
  }

  public double getr() {
    return r;
  }

  public void setr(double r) {
    this.r = r;
  }

  public static void main(String[] args) {
    Circle c = new Circle(4);
    System.out.println("圆形的面积为：" + c.getArea());
  }

}
