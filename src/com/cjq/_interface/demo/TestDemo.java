package com.cjq._interface.demo;

public class TestDemo {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    UsbInterface usb = new UDisk();
    usb.service();

    usb = new Printer();
    usb.service();
  }

}
