package com.cjq.javase.oop.override;

public class Person {

  private String name;
  private String gender;
  private int age;
  private String identity;

  /**
   * 无参构造函数
   */
  public Person() {
  }
  
  /**
   * 构造函数
   * 
   * @param name
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * 
   * 构造函数
   * 
   * @param name
   * @param gender
   * @param age
   * @param identity
   */
  public Person(String name, String gender, int age, String identity) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.identity = identity;
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

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

}
