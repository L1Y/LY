package com.cjq._interface.login;

import java.util.Scanner;

import com.cjq._interface.login.HttpConnection.HttpListener;

public class LoginActivity {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("请输入：");
    int choice = in.nextInt();
    HttpConnection hc = new HttpConnection();
    // hc.doLogin(choice, new LoginActivity());
    
    // 匿名内部类的形式
    hc.doLogin(choice, new HttpListener(){

      @Override
      public void onSuccess() {
        System.out.println("连接成功！");
      }

      @Override
      public void onFileNotExist() {
        System.out.println("页面不存在！");
      }

      @Override
      public void onFailure() {
        System.out.println("连接失败！");
      }
      
    });

    in.close();
  }

/*  @Override
  public void onSuccess() {
    System.out.println("连接成功！");
  }

  @Override
  public void onFileNotExist() {
    System.out.println("页面不存在！");
  }

  @Override
  public void onFailure() {
    System.out.println("连接失败！");
  }*/

}
