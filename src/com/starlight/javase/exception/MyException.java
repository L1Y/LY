package com.starlight.javase.exception;

public class MyException implements MEInterface {
      static int num;
      static boolean ExceptionListener = false;
      
      @Override
      public void MyTry(){
            if(num >10 || num <1){
                  ExceptionListener = true;
                  
            }
            this.MyCatch();
            this.MyFinally();
      }
      
      @Override
      public void MyCatch(){
            if(ExceptionListener){
                  System.out.println("请输入合适的数");
            }
      }
      
      @Override
      public void MyFinally(){
            System.out.println("MyFinally");
      }
      
      public MyException(){
            
      }
      
      public MyException(int n){
           num  = n;
           this.MyTry();
      }
}
