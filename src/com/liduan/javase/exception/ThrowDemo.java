package com.liduan.javase.exception;

public class ThrowDemo {

	public static void main(String[] args) {
		demoProc();
		System.out.println("�쳣����");
	}
	
	public static void demoProc(){
		try{
			System.out.println("throw֮ǰ");
			//throw new NullPointerException();
			//throw new String();//throw ֻ�ܸ�Throwable�������
			//System.out.println("throw֮��");
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

}
