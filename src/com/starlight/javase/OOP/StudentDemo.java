package com.starlight.javase.OOP;
import java.util.Scanner;

public class StudentDemo {

      public static void main(String[] args) {
            // TODO �Զ����ɵķ������
            System.out.println("��������������");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("����������ѧ��");
            int stuNum = sc.nextInt();
            System.out.println("����������Ա�");
            String gender = sc.nextLine();
            Student stu = new Student(name , stuNum , gender);
            sc.close();
            System.out.println(stu.toString());

      }

}
