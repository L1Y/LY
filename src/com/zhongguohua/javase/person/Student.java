package com.zhongguohua.javase.person;

public class Student extends Person{
	private String no;
	private String major;
	private String cla;
	private String school;
//	
//	public Student(String no){
//		this.no = no;
//	}
//	
//	public Student(String no,String major){
//		this(no);
//		this.major = major;
//	}
//	
//	public Student(String no,String major,String cla){
//		this(no,major);
//		this.cla = cla;
//	}
	
	public Student(String name,String gender,String age,String identify,String no,String major,String cla,String school){
		super(name,gender,age,identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public void setNo(String no){
		this.no = no;
	}
	
	public String getNo(){
		return no;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public String getMajor(){
		return major;
	}
	
	public void setCla(String cla){
		this.cla = cla;
	}
	
	public String getCla(){
		return cla;
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public String getSchool(){
		return school;
	}
	@Override
	public String getName(){
		return super.getName() + "学生";
	}
	@Override
	public String toString(){
		return "学号：" + no + "\n姓名：" + super.getName() + "\n性别：" + super.getGender() + "\n年龄：" + super.getAge() + "\n学校：" + school + "\n专业：" + major + "\n班级:"
				+ cla + "\n身份证号：" + super.getIdentify();
	}
}
