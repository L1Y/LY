package com.lizhenglin.javase.person;

public class Student extends Person
{
  protected String no;
  protected String major;
  protected String cla;
  protected String school;

  public Student(String name, String gender, int age, String identify, String no,
      String major, String cla, String school)
  {
    super(name, gender, age, identify);
    this.no = no;
    this.major = major;
    this.cla = cla;
    this.school = school;
  }

  @Override
  public String getName()
  {
    return super.getName() + "（学生）";
  }

  public String getNo()
  {
    return no;
  }

  public void setNo(String no)
  {
    this.no = no;
  }

  public String getMajor()
  {
    return major;
  }

  public void setMajor(String major)
  {
    this.major = major;
  }

  public String getCla()
  {
    return cla;
  }

  public void setCla(String cla)
  {
    this.cla = cla;
  }

  public String getSchool()
  {
    return school;
  }

  public void setSchool(String school)
  {
    this.school = school;
  }

  @Override
  public String toString()
  {
    return "姓名:" + getName() + "\n" + "年龄:" + getAge() + "\n" + "性别:" + getGender()
        + "\n" + "身份证:" + getIdentify() + "\n" + "学校:" + getSchool() + "\n" + "学号:"
        + getNo() + "\n" + "专业:" + getMajor() + "\n" + "班级:" + getCla();
  }
}
