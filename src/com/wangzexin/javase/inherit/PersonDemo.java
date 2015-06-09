package com.wangzexin.javase.inherit;

public class PersonDemo {
    
    public static void main(String[] args){
        
        Student student = new Student("广东工业大学","电子信息工程","12级3班", 2785, "王泽鑫", "男", 20, "445224");
        System.out.println(student.getName());
        
        System.out.println(student);
        
    }
}
