package com.cjq.javase.review.Calculator;

public class CalculatorDemo {

  public static void main(String[] args) {
    Calculator c = new Calculator(10,5,'¡Á');
    System.out.println("10 ¡Á 5 = " + c.getResult());
  }

}
