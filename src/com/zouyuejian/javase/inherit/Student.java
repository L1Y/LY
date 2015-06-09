package com.zouyuejian.javase.inherit;

public class Student extends Person{
	private String no;
	private String major;
	private String cla;
	private String school;
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
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * 重写getName方法
	 */
	@Override
	public String getName(){
		return super.getName() + "学生";
	}
	/**
	 * 
	 */
	@Override
	public String toString(){
		return "学号：" + getNo()+"\n姓名："+super.getName() + "\n性别：" + getGender() +"\n年龄：" + getAge()
				+ "\n班级：" + getCla() + "\n身份证号码：" + getIdentify() + "\n专业：" + getMajor() + "\n学校：" + getSchool();
	}
	
	public Student(String name, String gender, int age, String identify, String no, String major, String cla, String school) {
		super(name, gender, age, identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public Student(String name, String gender, int age, String identify) {
		super(name, gender, age, identify);
		
	}
}
