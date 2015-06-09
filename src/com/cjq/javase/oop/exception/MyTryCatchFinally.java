package com.cjq.javase.oop.exception;

public class MyTryCatchFinally {

  public void sequence(int choice, ExceptionListener listener) {
    if (choice >= 1 && choice <= 10) {
      listener.myTry();
      listener.myFinally();
    } else {
      listener.myTry();
      listener.myCatch();
      listener.myFinally();
    }
  }

  public interface ExceptionListener {

    public void myTry();

    public void myCatch();

    public void myFinally();

  }
}
