package com.aisiwei.javase.interfacedemo;

import java.util.Scanner;

import com.aisiwei.javase.interfacedemo.HttpConnection.HttpListener;

public class LoginActivity implements HttpListener
{ 

 static void main(String[] args)
 {
	
	Scanner sc = new Scanner(System.in);
	 int arg = sc.nextInt();
	 HttpConnection hc = new HttpConnection();
	 hc.doLogin(arg, new LoginActivity());
	 sc.close();
 }

@Override
public void onSuccess() {
	System.out.println("�ɹ�");
	
}

@Override
public void onFileNotExist() {
	System.out.println("������");
	
}

@Override
public void Failure() {
	System.out.println("ʧ��");
	
}
 
}
