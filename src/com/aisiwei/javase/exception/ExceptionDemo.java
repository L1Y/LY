package com.aisiwei.javase.exception;

public class ExceptionDemo {
	//public void catchArithmeticException()
	public static void main(String[] args)
	{
		int[] array = new int[]{1,2,3,4,5};
	try{
		int x = 2/0;
		int y = array[5];
	}

	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch(ArithmeticException e ){
		e.printStackTrace();
	}
	finally{
		System.out.println("感谢使用程序");
	}
  }

}
