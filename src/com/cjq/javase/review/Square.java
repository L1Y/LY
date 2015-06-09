package com.cjq.javase.review;

/**
 * ����һ���볤�����йص��ࡣ
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
   * �����
   * @return
   */
  public double getArea() {
    return high * wide;
  }

  /**
   * ����������ķ���
   * @param high
   * @param wide
   * @return
   */
  public double getArea(double high, double wide) {
    return high * wide;
  }

  /**
   * �������Ĺ��췽��
   * @param high
   * @param wide
   */
  public Square(double high, double wide) {
    this.high = high;
    this.wide = wide;
  }

  /**
   * ���췽��������
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
    System.out.println("���ε����Ϊ��" + s.getArea());
  }

}
