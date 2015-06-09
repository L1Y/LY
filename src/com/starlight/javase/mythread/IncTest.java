/**
 * 
 */
package com.starlight.javase.mythread;

/**
 * @author Flying Starlight
 *
 */
public class IncTest {

      public static int count;
      /**
       * @param args
       */
      public static void main(String[] args) {
            // TODO 自动生成的方法存根
            IncTest t = new IncTest();
            for(int i = 0 ; i < 1000 ; i++){
                  t.createThThread();
            }
            System.out.println(count);

      }
      public void createThThread(){
            new Thread(new Runnable(){
                  @Override
                  public void run(){
                        counter();
                  }
                  
            }).start();
      }
      
      public static void counter(){
            try{
                  Thread.sleep(1);
            }catch(InterruptedException e){
                  e.printStackTrace();
            }
            count++;
      }

}
