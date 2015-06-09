package com.zhongguohua.javase.calculator;
import java.util.Scanner;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private String mark;
	
	/**
	 * 判断输入的字符是否为纯数字
	 * @param stringIn 输入的字符
	 * @return 是纯数字则返回true，否则返回false
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
	 * 判断输入字符是否为运算符
	 * @param stringIn 输入的字符
	 * @return 是运算符则返回true，否则返回false
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
	 * 获取计算结果
	 */
	public int getResult(){
			if(mark.equals("/")){
				if(secondNumber != 0){
					return firstNumber / secondNumber;
				}
				else{
					System.out.println("除数不能为 0 ");
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
				System.out.print("输入错误，请重新输入");
			}
		}
		else{
			System.out.print("输入不能为空");
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
				System.out.print("输入错误，请重新输入");
			}
		}
		else{
			System.out.print("输入不能为空");
		}
		return false;
	}
}

