package com.cjq.javase.oop.exception;

import java.util.Scanner;

import com.cjq.javase.oop.exception.MyTryCatchFinally.ExceptionListener;

public class MyTest {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("«Î ‰»Î ˝◊÷1~10£∫");
    int choice = in.nextInt();
    
    MyTryCatchFinally mtc = new MyTryCatchFinally();
    
    mtc.sequence(choice, new ExceptionListener(){

      @Override
      public void myTry() {
        System.out.println("myTry()");
      }

      @Override
      public void myCatch() {
        System.out.println("myCatch()");
      }

      @Override
      public void myFinally() {
        System.out.println("myFinally()");
      }
      
    });

    in.close();
    
  }

}
