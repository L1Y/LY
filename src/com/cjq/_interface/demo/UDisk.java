package com.cjq._interface.demo;
public class UDisk implements UsbInterface {

  @Override
  public void service() {
    System.out.println("传送数据到u盘!");
  }

}
