package com.lupeifa.javase.exception;

//import java.util.Scanner;
/**
 * 
 * @author Lu
 *
 *һ���쳣����������
 *1�������ǻ��ж��쳣�����쳣����
 *
 *����try��catch�����ִ��˳��
 *    ���try
 */
public class ArithmeticExceptionDemo {
	
	public static void main(String[] args){
		
		/*Scanner sc = new Scanner(System.in);
		int num1;
		int num2;*/
		try{
		     /*System.out.println("��������num1��");
		    num1 = sc.nextInt();
		    System.out.println("��������num2��");
		    num2 = sc.nextInt();
		    System.out.println("num1/num2="+num1/num2);*/
			
			/**/
		    System.out.println(1/0);
		    
		    int[] array = new int[1];
		    System.out.println(array[2]);
		}
	    catch(ArithmeticException e){
	    	e.printStackTrace();
	    	System.out.println("��������Ϊ0");
	    	}
	    catch(ArrayIndexOutOfBoundsException e){
	    	e.printStackTrace();
	    	System.out.println("����Խ����");
	    	}
		System.out.println("�쳣�������");
	    }
}
