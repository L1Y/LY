package com.lzm.javase.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseNum;
		//String[] course = new String[] {"语文", "数学", "英语"};
		
		String[] course = {"语文", "数学", "英语"};
		String answer;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("请输入课程号：");
			courseNum = scanner.nextInt();
			if (!(--courseNum>=0 && --courseNum-1<=2)) {
				
				//throw new Exception("自定义抛出异常类星系");
				throw new MyException();
			}
			answer = course[courseNum];
			System.out.println("课程是：" + answer);
			
		} catch (InputMismatchException e) {
			System.out.println("输入不匹配");
		} catch (MyException e) {
			System.out.println(e.toString());
			System.out.println("课程不存在");
		} catch (Exception e) {
			System.out.println("程序异常");
		} finally {
			scanner.close();
			System.out.println("欢迎提出简易");
		}

	}

}

//自定义异常
class MyException extends Exception {
	
	@Override
	public String toString() {
		return "MyException";
	}
	
}
