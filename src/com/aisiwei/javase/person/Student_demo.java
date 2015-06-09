package com.aisiwei.javase.person;

public class Student_demo
{
    public static void main(String args[])
    {
    	Student student = new Student("艾斯维","男",21,31112,440111,"电子信息工程","12级应电（2）班","广东工业大学");
    	System.out.println(student);//println括号里面直接执行的是toString方法，即可以不用student,toString。
    }
    
}
