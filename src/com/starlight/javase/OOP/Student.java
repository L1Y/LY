package com.starlight.javase.OOP;

import com.starlight.javase.OOP.Person;

class Student extends Person {
      private int stuNum = 0;
      private String major = "default";
      private String school = "default";
      

      Student(String name, String sex) {
            super(name, sex);
      }
      
      Student(String name, String sex , int age) {
            super(name, sex , age);
      }
      
      Student(String name, String sex , int age , int IDCard) {
            super(name, sex , age , IDCard);
      }
      
      Student(String name , int stuNum , String sex ){
            this(name , sex);
            this.stuNum = stuNum;
      }

      public int getStuNum() {
            return stuNum;
      }

      public void setStuNum(int stuNum) {
            this.stuNum = stuNum;
      }

      public String getMajor() {
            return major;
      }

      public void setMajor(String major) {
            this.major = major;
      }

      public String getSchool() {
            return school;
      }

      public void setSchool(String school) {
            this.school = school;
      }
      
      public String getName(){
            return super.getName() + "学生" ; 

      }

      @Override
      public String toString() {
            return "学生学号为" + stuNum + ", 你是" + getName();
      }
      
      
      

}
