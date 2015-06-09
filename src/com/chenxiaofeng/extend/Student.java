package com.chenxiaofeng.extend;

public class Student extends Person {
	private String no;
	private String major;
	private String classs;
	private String school;
	
	public Student(){}

	public Student(String name, String gender, int age, String iDCardNo,
			String no, String major, String classs, String school) {
		super(name, gender, age, iDCardNo);
		this.no = no;
		this.major = major;
		this.classs = classs;
		this.school = school;
	}



	public String getName(){
		return name+"学生";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String toString(){
		return "姓名："+name+"\n性别："+gender+"\n年龄："+age+"\n身份证号："+IDCardNo
				+"\n学号："+no+"\n专业："+major+"\n班级："+classs+"\n学校："+school;
	}
	
}
