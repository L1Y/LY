package com.lizhenglin.javase.person;

public class Person
{
  protected String name;
  protected String gender;
  protected int age;
  protected String identify;
  
  public Person()
  {
    
  }
  public Person(String name)
  {
    this.name = name;
  }
  public Person(String name,String gender,int age,String identify)
  {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.identify = identify;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }

  public void setGender(String gender)
  {
    this.gender = gender;
  }

  public String getGender()
  {
    return gender;
  }

  public void setIdentify(String identify)
  {
    this.identify = identify;
  }

  public String getIdentify()
  {
    return identify;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
}
