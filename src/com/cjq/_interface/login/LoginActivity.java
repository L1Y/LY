package com.cjq._interface.login;

import java.util.Scanner;

import com.cjq._interface.login.HttpConnection.HttpListener;

public class LoginActivity {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("�����룺");
    int choice = in.nextInt();
    HttpConnection hc = new HttpConnection();
    // hc.doLogin(choice, new LoginActivity());
    
    // �����ڲ������ʽ
    hc.doLogin(choice, new HttpListener(){

      @Override
      public void onSuccess() {
        System.out.println("���ӳɹ���");
      }

      @Override
      public void onFileNotExist() {
        System.out.println("ҳ�治���ڣ�");
      }

      @Override
      public void onFailure() {
        System.out.println("����ʧ�ܣ�");
      }
      
    });

    in.close();
  }

/*  @Override
  public void onSuccess() {
    System.out.println("���ӳɹ���");
  }

  @Override
  public void onFileNotExist() {
    System.out.println("ҳ�治���ڣ�");
  }

  @Override
  public void onFailure() {
    System.out.println("����ʧ�ܣ�");
  }*/

}
