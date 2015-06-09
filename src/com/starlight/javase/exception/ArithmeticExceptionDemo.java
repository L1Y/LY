package com.starlight.javase.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
      
      static int num = 0;
      static int result = 0;
      static int[] a = new int[3];
      public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            try{
                  result = 20/num;
/*                  for(int i = 0; i < 4; i++){
                        a[i] = 1;
                  }
                  System.out.println(result);
*/                  
            }catch(ArithmeticException e){
                  System.out.println("exception");
                  try{
                        for(int i = 0; i < 4; i++){
                              a[i] = 1;
                        }  
                  }catch(ArrayIndexOutOfBoundsException e1){
                        System.out.println("exceptionarray");
                  }

            }
            
            sc.close();
      
      }

}
