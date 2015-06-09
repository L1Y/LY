package com.cjq.javase.review.Calculator;

public class Calculator {

  private static int x;
  private static int y;
  private static char mark;

  public Calculator() {

  }

  public Calculator(int a, int b, char o) {
    x = a;
    y = b;
    mark = o;

  }

  /**
   * ����������������Ľ��
   * 
   * @return ���ؼ�����
   */
  public int getResult() {
    switch (mark) {
    case '+':
      return x + y;
    case '-':
      return x - y;
    case '*':
      return x * y;
    case '/':
      return x / y;
    default:
      return 0;
    }
  }

  /**
   * �����������������Ľ��
   * 
   * @return ���ؼ�����
   */

/*  public float getResult1() {
    return (float) x / y;
  }*/

  /**
   * �ж��Ƿ�Ϊ����������һ����ȷ������
   * 
   * @param str
   * @return
   */
  public boolean isNumberic(String str) {
    int length = str.length();
    for (int i = 0; i < length; i++) {
      if (str.codePointAt(i) < '0' || str.codePointAt(i) > '9') {
        return false;
      }
    }
    return true;
  }

  /**
   * �ж��Ƿ�Ϊ�����
   * 
   * @return
   */
  public boolean isMark(char mark) {
    if (mark == '+' || mark == '-' || mark == '*' || mark == '/') {
      return true;
    }
    return false;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    Calculator.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    Calculator.y = y;
  }

  public char getMark() {
    return mark;
  }

  public void setMark(char mark) {
    Calculator.mark = mark;
  }

}
