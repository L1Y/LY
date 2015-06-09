package com.fengdi.javase.review;

public class Student extends Person {
	private int no;
	private String major;
	private String cla;
	private String school;

	@Override
	public String getName() {
		return super.getName() + "同学";

	}

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

	public Student(String name, String gender, int age, String identity,
			int no, String major, String cla, String school) {
		super(name, gender, age, identity);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	@Override
	public String toString(){
		return  "姓名：" + super.getName() + "\n性别：" + super.getGender() + "\n年纪：" + super.getAge() + "\n身份证：" + super.getIdentity() +"\n学号：" + this.getNo() +
				"\n专业：" + this.getMajor()+"\n年级：" + this.getCla() + "\n学校：" + this.getSchool() ; 
				 
				
		
	}	
	
	public static void main(String[] args){
		Student S = new Student("冯迪" , "男" , 24  , "42900419911002471X" , 89757 , "模具" ,"007" , "南昌理工");
		
		System.out.print(S);
	}
	
	
	
	
	
	
}
