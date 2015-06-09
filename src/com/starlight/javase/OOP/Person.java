package com.starlight.javase.OOP;

public class Person {
      private String name = "0";
      private String gender = "male";
      private int age = 0;
      private int IDCard = 0; // this represent user's identity card number
      
      
      protected Person(String name , String sex){
            this.name = name;
            this.gender = sex;
            
      }
      
      Person(String name , String sex , int age){
            this(name , sex);
            this.age = age;
            
      }
      
      Person(String name , String sex , int age , int IDCard ){
            this(name , sex , age);
            this.IDCard = IDCard;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public int getAge() {
            return age;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public int getIDCard() {
            return IDCard;
      }

      public void setIDCard(int iDCard) {
            IDCard = iDCard;
      }
      
      
      


}
