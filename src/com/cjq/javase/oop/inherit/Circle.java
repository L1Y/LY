package com.cjq.javase.oop.inherit;

/**
 * ����һ����Բ���йص��ࡣ
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
   * ��Բ�ε����
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
    System.out.println("Բ�ε����Ϊ��" + c.getArea());
  }

}
