/**
 * 
 */
package com.starlight.javase.mythread;

/**
 * @author Flying Starlight
 *
 */
public class Mythread extends Thread{
      
      @Override
      public void run(){
            System.out.println("this is my first thread");
            for(int i = 0 ; i < 10 ; i++){
                  if(i == 5){
                        try{
                              this.interrupt();
                        }catch(SecurityException e){
                              System.out.println("Permission Denied");
                        }
                  }
                  System.out.println(i);
            }
      }
      
      public static void main(String[] arg){
            Mythread mt = new Mythread();
            mt.start();
      }

}
