package com.cjq.javase.review;

/**
 * 这是一个与长方形有关的类。
 * @author i_Mjunqi
 *
 */
public class Square {

  private double high;
  private double wide;
  private String name;
  
  public double getHigh() {
    return high;
  }

  public void setHigh(double high) {
    this.high = high;
  }

  public double getWide() {
    return wide;
  }

  public void setWide(double wide) {
    this.wide = wide;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 求面积
   * @return
   */
  public double getArea() {
    return high * wide;
  }

  /**
   * 重载求面积的方法
   * @param high
   * @param wide
   * @return
   */
  public double getArea(double high, double wide) {
    return high * wide;
  }

  /**
   * 带参数的构造方法
   * @param high
   * @param wide
   */
  public Square(double high, double wide) {
    this.high = high;
    this.wide = wide;
  }

  /**
   * 构造方法的重载
   * @param name
   * @param high
   * @param wide
   */
  public Square(String name, double high, double wide) {
    this(high,wide);
    this.name = name;
  }

  public static void main(String[] args) {
    Square s = new Square(15, 20);
    System.out.println("矩形的面积为：" + s.getArea());
  }

}
