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
		return super.getName() + "ѧ��";
	}
	
	@Override 
	public String toString(){
		return "���� : " + super.getName() + '\n' + "ѧ�� : " + getNo() + '\n' + "רҵ : " + getMajor() + '\n' + "�Ա� : " + super.getGender() + '\n'
				+ "���� : " + super.getAge() + '\n' + "���֤ : " + super.getIdenify() + '\n' + "�༶ : " + getCla() + '\n'+ "ѧУ : " + getSchool();
	}
	
}
