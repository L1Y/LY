package com.zhongguohua.javase.calculator;
import java.util.Scanner;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private String mark;
	
	/**
	 * �ж�������ַ��Ƿ�Ϊ������
	 * @param stringIn ������ַ�
	 * @return �Ǵ������򷵻�true�����򷵻�false
	 */
	public boolean isNumber(String stringIn){
		char[] charIn = stringIn.toCharArray();
		int len = charIn.length;
		for(int i = 0; i < len; i++){
			if(charIn[i] >='0' && charIn[i] <= '9'){
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �ж������ַ��Ƿ�Ϊ�����
	 * @param stringIn ������ַ�
	 * @return ��������򷵻�true�����򷵻�false
	 */
	public boolean isMark(String stringIn){
		String[] markArray = {"+" , "-" , "*" ,"/"};
		for(String item:markArray){
			if(item.equals(markArray)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ��ȡ������
	 */
	public int getResult(){
			if(mark.equals("/")){
				if(secondNumber != 0){
					return firstNumber / secondNumber;
				}
				else{
					System.out.println("��������Ϊ 0 ");
				}
			}
			else if(mark.equals("-")){
				return firstNumber - secondNumber;
			}
			else if(mark.equals("*")){
				return firstNumber / secondNumber;
			}
			else{
				return firstNumber / secondNumber;
			}
		return 0;
	}
	
	public int getFirstNumber(){
		return firstNumber;
	}
	
	public int getSecondNumber(){
		return secondNumber;
	}
	
	public String getMark(){
		return mark;
	}
	
	public void setFirstNumber(int firstNumber){
		this.firstNumber = firstNumber;
	}
	
	public void  setSecondNumber(int secondNumber){
		this.secondNumber = secondNumber;
	}
	public void  setMark(String mark){
		this.mark = mark;
	}
	
	public boolean setFirstNumber(String firstNumber){
		if(firstNumber != null && firstNumber.length() > 0){
			if(isNumber(firstNumber)){
				int x = Integer.parseInt(firstNumber);
				setFirstNumber(x);
				return true;
			}
			else{
				System.out.print("�����������������");
			}
		}
		else{
			System.out.print("���벻��Ϊ��");
		}
		return false;
	}
	
	public boolean setSecondNumber(String secondNumber){
		if(secondNumber != null && secondNumber.length() > 0){
			if(isNumber(secondNumber)){
				int x = Integer.parseInt(secondNumber);
				setSecondNumber(x);
				return true;
			}
			else{
				System.out.print("�����������������");
			}
		}
		else{
			System.out.print("���벻��Ϊ��");
		}
		return false;
	}
}

