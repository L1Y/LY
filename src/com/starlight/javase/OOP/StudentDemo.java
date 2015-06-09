package com.starlight.javase.OOP;
import java.util.Scanner;

public class StudentDemo {

      public static void main(String[] args) {
            // TODO 自动生成的方法存根
            System.out.println("请输入您的姓名");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("请输入您的学号");
            int stuNum = sc.nextInt();
            System.out.println("请输入你的性别");
            String gender = sc.nextLine();
            Student stu = new Student(name , stuNum , gender);
            sc.close();
            System.out.println(stu.toString());

      }

}
