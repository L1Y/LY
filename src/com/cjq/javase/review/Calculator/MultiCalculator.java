package com.cjq.javase.review.Calculator;

import java.util.Scanner;

/**
 * ������������ʽ�ӵĸ߼���������
 * û���������жϣ�������������ȷ��ʽ�ӽ�����֤������ 1+2+3 ��Ȼ�󰴻س������ɲ鿴���н����
 * ���ӳ˳����ȼ�...
 * 
 * @author i_Mjunqi
 *
 */
public class MultiCalculator {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("* * * * * * �߼�������    * * * * * *");
    System.out.print("������Ҫ�����ʽ�ӣ�");
    String str = in.nextLine();

    Calculator cal = new Calculator();

    int length = str.length();
    int temp = 0;
    int result = 0;
    cal.setMark('+');
    for (int i = 0; i < length; i++) {
      if (cal.isMark(str.charAt(i))) {
        cal.setY(Integer.parseInt(str.substring(temp, i)));
        System.out.print(cal.getY() + " ");
        result = cal.getResult();
        cal.setX(result);
        cal.setMark(str.charAt(i));
        System.out.print(cal.getMark() + " ");
        temp = i + 1;
      }
    }
    
    cal.setY(Integer.parseInt(str.substring(temp, length)));
    System.out.print(cal.getY() + " ");
    result = cal.getResult();

    System.out.println("= " + result);

    in.close();

  }

}
