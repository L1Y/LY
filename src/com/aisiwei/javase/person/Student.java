package com.aisiwei.javase.person;

public class Student extends Person
{
	private int no;
	private String major;
	private String class_;
	private String school;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	public Student()
	{
		
	}
	
	public Student(String name, String gender, int age, int identify,int no,String major,String class_,String school)
	{
		super(name,gender,age,identify);
		this.no = no;
		this.major = major;
		this.class_ = class_;
		this.school = school;
	}
	

	
	@Override
	public String getName()
		{
		   return super.getName() + "学生";	
		}

	public String toString()
	{
		return "学号:"+no+"\n姓名："+super.getName()+"\n性别："+super.getGender()+"\n年龄："+super.getAge()+"\n身份证："+super.getIdentify()+"\n专业："+major+"\n班级："+class_+"\n学校:"+school;
	}
	
}
