package com.lupeifa.javase.exception;

/**
 * 
 * @author Lu
 *
 */

public class NestTry {
	public static void main(String[] args){
		nest3();
		
		

}
    public static void nest3(){
	try{

	    System.out.println(1/0);
	    

	}
    catch(ArithmeticException e){
    	e.printStackTrace();
    	System.out.println("除数不能为0");
		   try{ 
			   int[] array = new int[1];
		       System.out.println(array[2]);
		    }	    
		   catch(ArrayIndexOutOfBoundsException e1){
		    	e1.printStackTrace();
		    	System.out.println("数组越界了");
		    	}
    	}
    }
}