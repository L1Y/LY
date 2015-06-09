package com.chuan.javase.person;

public class Student extends Person {
	protected String no;
	protected String major;
	protected String cla;
	protected String school;
	
	public void setNo(String no){
		this.no =no;
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
	
	public Student(){
		
	}
	
	public Student(String name,String gender,String age,String idenify,String no,String major,String cla,String school){
		super(name,gender,age,idenify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	
	@Override
	public String getName(){
		return super.getName() + "学生";
	}
	
	@Override 
	public String toString(){
		return "姓名 : " + super.getName() + '\n' + "学号 : " + getNo() + '\n' + "专业 : " + getMajor() + '\n' + "性别 : " + super.getGender() + '\n'
				+ "年龄 : " + super.getAge() + '\n' + "身份证 : " + super.getIdenify() + '\n' + "班级 : " + getCla() + '\n'+ "学校 : " + getSchool();
	}
	
}
