package com.cjq._interface.demo;

public class Printer implements UsbInterface {

  @Override
  public void service() {
    System.out.println("��ӡ���ęn...");
  }

}
